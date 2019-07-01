package mod.williamvincent.blocksandbeholders;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class CharacterSheet extends Item  {
    protected int strength=10;
    protected int dexterity=10;
    protected int constituion=10;
    protected int intelligence=10;
    protected int wisdom=10;
    protected int charisma=10;
    protected int CharLevel=1;
    protected int class1lvl=1;
    protected int class2lvl=0;
    protected int class3lvl=0;
    protected String class1;
    protected String class2;
    protected String class3;



    public CharacterSheet(Properties properties) {
        super(properties);
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     *
     * @param worldIn
     * @param playerIn
     * @param handIn
     */
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        EntityPlayerMP entityPlayerMP = (EntityPlayerMP) playerIn;
        NetworkHooks.openGui(entityPlayerMP,new GUICharacterSheet());
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstituion() {
        return constituion;
    }

    public void setConstituion(int constituion) {
        this.constituion = constituion;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharLevel() {
        return CharLevel;
    }

    public void setCharLevel(int charLevel) {
        CharLevel = charLevel;
    }

    public int getClass1lvl() {
        return class1lvl;
    }

    public void setClass1lvl(int class1lvl) {
        this.class1lvl = class1lvl;
    }

    public int getClass2lvl() {
        return class2lvl;
    }

    public void setClass2lvl(int class2lvl) {
        this.class2lvl = class2lvl;
    }

    public int getClass3lvl() {
        return class3lvl;
    }

    public void setClass3lvl(int class3lvl) {
        this.class3lvl = class3lvl;
    }
}
