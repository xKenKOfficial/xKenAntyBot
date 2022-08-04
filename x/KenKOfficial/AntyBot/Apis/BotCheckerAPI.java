package x.KenKOfficial.AntyBot.Apis;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import x.KenKOfficial.AntyBot.Files.BotFile;

public class BotCheckerAPI
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    private static /* synthetic */ BotFile bf;
    
    public static boolean PlayedBefore(final String IlIllllllllllll) {
        if (IIl(getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(BotCheckerAPI.I[BotCheckerAPI.l[0]]).append(IlIllllllllllll))))) {
            getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(BotCheckerAPI.I[BotCheckerAPI.l[1]]).append(IlIllllllllllll)), (Object)(boolean)(BotCheckerAPI.l[1] != 0));
            getDataFolder().saveData();
            getDataFolder().reloadData();
            return BotCheckerAPI.l[0] != 0;
        }
        if (lIl(getDataFolder().getFile().getBoolean(String.valueOf(new StringBuilder().append(BotCheckerAPI.I[BotCheckerAPI.l[2]]).append(IlIllllllllllll))) ? 1 : 0)) {
            return BotCheckerAPI.l[1] != 0;
        }
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(BotCheckerAPI.I[BotCheckerAPI.l[3]]).append(IlIllllllllllll)), (Object)(boolean)(BotCheckerAPI.l[1] != 0));
        getDataFolder().saveData();
        getDataFolder().reloadData();
        return BotCheckerAPI.l[0] != 0;
    }
    
    private static boolean lIl(final int lIllIIlllllllll) {
        return lIllIIlllllllll != 0;
    }
    
    private static boolean IIl(final Object llllIIlllllllll) {
        return llllIIlllllllll == null;
    }
    
    private static boolean Ill(final int IlIIlIlllllllll, final int lIIIlIlllllllll) {
        return IlIIlIlllllllll < lIIIlIlllllllll;
    }
    
    static {
        ll();
        Il();
        BotCheckerAPI.bf = BotFile.getInstance();
    }
    
    private static void Il() {
        (I = new String[BotCheckerAPI.l[4]])[BotCheckerAPI.l[0]] = I("/ZuntFnDH1Gzq2oivxW9Hg==", "xtsKO");
        BotCheckerAPI.I[BotCheckerAPI.l[1]] = l("GBUUBBQkCxoZGiMMGFg=", "Bbqvm");
        BotCheckerAPI.I[BotCheckerAPI.l[2]] = I("VGASQTdN+IH/RwtklP5XRg==", "NNfBu");
        BotCheckerAPI.I[BotCheckerAPI.l[3]] = l("LCURJikQOx87Jxc8HXo=", "vRtTP");
    }
    
    public static BotFile getDataFolder() {
        return BotCheckerAPI.bf;
    }
    
    private static void ll() {
        (l = new int[5])[0] = ((0x72 ^ 0x5D ^ (0x6B ^ 0x4)) & (124 + 159 - 100 + 52 ^ 147 + 60 - 48 + 12 ^ -" ".length()));
        BotCheckerAPI.l[1] = " ".length();
        BotCheckerAPI.l[2] = "  ".length();
        BotCheckerAPI.l[3] = "   ".length();
        BotCheckerAPI.l[4] = (0x21 ^ 0x74 ^ (0x68 ^ 0x39));
    }
    
    private static String l(String lIlllIlllllllll, final String lIIIIllllllllll) {
        lIlllIlllllllll = new String(Base64.getDecoder().decode(lIlllIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIllllllllll = new StringBuilder();
        final char[] lllllIlllllllll = lIIIIllllllllll.toCharArray();
        int IllllIlllllllll = BotCheckerAPI.l[0];
        final short IIIllIlllllllll = (Object)lIlllIlllllllll.toCharArray();
        final byte lllIlIlllllllll = (byte)IIIllIlllllllll.length;
        float IllIlIlllllllll = BotCheckerAPI.l[0];
        while (Ill((int)IllIlIlllllllll, lllIlIlllllllll)) {
            final char llIIIllllllllll = IIIllIlllllllll[IllIlIlllllllll];
            IIIIIllllllllll.append((char)(llIIIllllllllll ^ lllllIlllllllll[IllllIlllllllll % lllllIlllllllll.length]));
            "".length();
            ++IllllIlllllllll;
            ++IllIlIlllllllll;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(IIIIIllllllllll);
    }
    
    private static String I(final String IlIIlllllllllll, final String lIIIlllllllllll) {
        try {
            final SecretKeySpec lIlIlllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlllllllllll = Cipher.getInstance("Blowfish");
            IIlIlllllllllll.init(BotCheckerAPI.l[2], lIlIlllllllllll);
            return new String(IIlIlllllllllll.doFinal(Base64.getDecoder().decode(IlIIlllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllllllllll) {
            llIIlllllllllll.printStackTrace();
            return null;
        }
    }
}
