package x.KenKOfficial.AntyBot.Files;

import java.io.File;
import x.KenKOfficial.AntyBot.Basic.Main;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class BlacklistFile
{
    private static /* synthetic */ BlacklistFile bipFile;
    private static final /* synthetic */ String[] lll;
    private static final /* synthetic */ int[] llIl;
    
    private static String lllIl(final String IIlIIIlIIllllll, final String lIIIIIlIIllllll) {
        try {
            final SecretKeySpec lllIIIlIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIIIlIIllllll = Cipher.getInstance("Blowfish");
            IllIIIlIIllllll.init(BlacklistFile.llIl[2], lllIIIlIIllllll);
            return new String(IllIIIlIIllllll.doFinal(Base64.getDecoder().decode(IIlIIIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlIIllllll) {
            lIlIIIlIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IllIIl(final int lIllllIIIllllll) {
        return lIllllIIIllllll == 0;
    }
    
    public static BlacklistFile getDataFolder() {
        return BlacklistFile.bipFile;
    }
    
    private static void IIlIIl() {
        (lll = new String[BlacklistFile.llIl[2]])[BlacklistFile.llIl[0]] = lllIl("tWz2bjksbZJEoq6igWr3Kw==", "mUbnw");
        BlacklistFile.lll[BlacklistFile.llIl[1]] = lllIl("AVb9e7ctMhqUBZo9XrpHcg==", "sfQGh");
    }
    
    public void load() {
        final File IIIllIIlIllllll = new File(String.valueOf(new StringBuilder().append(BlacklistFile.lll[BlacklistFile.llIl[0]]).append(Main.getPlugin().getName()).append(BlacklistFile.lll[BlacklistFile.llIl[1]])));
        if (IllIIl(IIIllIIlIllllll.exists() ? 1 : 0)) {
            IIIllIIlIllllll.mkdir();
            "".length();
        }
    }
    
    private static void lIlIIl() {
        (llIl = new int[3])[0] = ("   ".length() & ~"   ".length());
        BlacklistFile.llIl[1] = " ".length();
        BlacklistFile.llIl[2] = "  ".length();
    }
    
    static {
        lIlIIl();
        IIlIIl();
        BlacklistFile.bipFile = new BlacklistFile();
    }
}
