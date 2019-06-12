package mod.williamvincent.blocksandbeholders;


import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author William Vincent
 */
@Mod(Main.MOD_ID)
public final class Main {
    public static final String MOD_ID= "blocksandbeholders";
    public static  final Logger LOGGER= LogManager.getLogger(MOD_ID);
    public Main (){
        LOGGER.debug("Hello from Blocks and Beholders");

    }
}
