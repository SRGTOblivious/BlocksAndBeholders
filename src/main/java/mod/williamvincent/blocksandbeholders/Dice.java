package mod.williamvincent.blocksandbeholders;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import java.util.Random;


public class Dice extends Item {
    protected int dieSize;
    protected int coolDown = 0;
    protected String name;

    public Dice(Properties properties, String name, int dieSize) {
        super(properties);
        this.name = name;
        this.dieSize = dieSize;
    }


    public Dice setDieSize(int dieSize) {
        this.dieSize = dieSize;
        return this;

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (coolDown <= 0) {
            Random roll = new Random();
            int numOfDice = playerIn.inventory.getCurrentItem().getStack().getCount() - 1;
            int rollResult = 0;
            if (numOfDice > 0) {
                if (dieSize != 20) {
                    while (numOfDice >= 0) {
                        rollResult += roll.nextInt(this.dieSize) + 1;
                        numOfDice--;
                    }
                    playerIn.sendMessage(new TextComponentString(" rolled a total of " + rollResult));
                }
                else if (dieSize==20){

                playerIn.sendMessage(new TextComponentString("rolled a " + (roll.nextInt(this.dieSize) + 1) + " and a " + (roll.nextInt(this.dieSize) + 1)));}

            }
            else {
                rollResult = roll.nextInt(this.dieSize) + 1;
                playerIn.sendMessage(new TextComponentString("rolled a " + rollResult));}
                coolDown = 50;
            }
            return super.onItemRightClick(worldIn, playerIn, handIn);
        }


        /**
         * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
         * update it's contents.
         *
         * @param stack
         * @param worldIn
         * @param entityIn
         * @param itemSlot
         * @param isSelected
         */
        @Override
        public void inventoryTick (ItemStack stack, World worldIn, Entity entityIn,int itemSlot, boolean isSelected){
            coolDown--;
            super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
        }
    }

