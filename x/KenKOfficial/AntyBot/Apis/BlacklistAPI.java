package x.KenKOfficial.AntyBot.Apis;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import x.KenKOfficial.AntyBot.Basic.Main;

public class BlacklistAPI
{
    private static final /* synthetic */ int[] llll;
    private static final /* synthetic */ String[] Illl;
    
    static {
        IIlIll();
        llIIll();
    }
    
    public static String getBlacklist(final String llIllIIIIllllll) {
        final File IlIllIIIIllllll = new File(String.valueOf(new StringBuilder().append(BlacklistAPI.Illl[BlacklistAPI.llll[8]]).append(Main.getPlugin().getName()).append(BlacklistAPI.Illl[BlacklistAPI.llll[9]]).append(llIllIIIIllllll).append(BlacklistAPI.Illl[BlacklistAPI.llll[10]])));
        if (lIlIll(IlIllIIIIllllll.exists() ? 1 : 0)) {
            final YamlConfiguration lIlllIIIIllllll = YamlConfiguration.loadConfiguration(IlIllIIIIllllll);
            final String IIlllIIIIllllll = String.valueOf(new StringBuilder().append(lIlllIIIIllllll.getString(BlacklistAPI.Illl[BlacklistAPI.llll[11]])).append(BlacklistAPI.Illl[BlacklistAPI.llll[12]]).append(lIlllIIIIllllll.getString(BlacklistAPI.Illl[BlacklistAPI.llll[13]])));
            return IIlllIIIIllllll;
        }
        return null;
    }
    
    public static void setBlacklist(final String lIllIlIIIllllll, final String lIIIllIIIllllll, final String IIIIllIIIllllll) {
        final File llllIlIIIllllll = new File(String.valueOf(new StringBuilder().append(BlacklistAPI.Illl[BlacklistAPI.llll[0]]).append(Main.getPlugin().getName()).append(BlacklistAPI.Illl[BlacklistAPI.llll[1]]).append(lIllIlIIIllllll).append(BlacklistAPI.Illl[BlacklistAPI.llll[2]])));
        final YamlConfiguration IlllIlIIIllllll = YamlConfiguration.loadConfiguration(llllIlIIIllllll);
        IlllIlIIIllllll.set(BlacklistAPI.Illl[BlacklistAPI.llll[3]], (Object)lIIIllIIIllllll);
        IlllIlIIIllllll.set(BlacklistAPI.Illl[BlacklistAPI.llll[4]], (Object)IIIIllIIIllllll);
        try {
            IlllIlIIIllllll.save(llllIlIIIllllll);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        catch (IOException llIIllIIIllllll) {
            llIIllIIIllllll.printStackTrace();
        }
    }
    
    private static void llIIll() {
        (Illl = new String[BlacklistAPI.llll[14]])[BlacklistAPI.llll[0]] = IIIIll("GhiNlrWPd+t+oEEbeV6lCw==", "yVpts");
        BlacklistAPI.Illl[BlacklistAPI.llll[1]] = IIIIll("MDe31c/YMI2k6ni3UdmkMA==", "PCHJE");
        BlacklistAPI.Illl[BlacklistAPI.llll[2]] = IIIIll("ZbvJxf63yqU=", "fWhUp");
        BlacklistAPI.Illl[BlacklistAPI.llll[3]] = lIIIll("IjI8Lhc=", "cVQGy");
        BlacklistAPI.Illl[BlacklistAPI.llll[4]] = IlIIll("618SuIshn4U=", "dmitd");
        BlacklistAPI.Illl[BlacklistAPI.llll[5]] = lIIIll("AyQQBi0dO0o=", "sHeaD");
        BlacklistAPI.Illl[BlacklistAPI.llll[6]] = IlIIll("pibucFA8i0nCLvuDz6Y8Ug==", "QwgYn");
        BlacklistAPI.Illl[BlacklistAPI.llll[7]] = IlIIll("+XzDYlf8AcU=", "OlupK");
        BlacklistAPI.Illl[BlacklistAPI.llll[8]] = lIIIll("CAsTMAwWFEk=", "xgfWe");
        BlacklistAPI.Illl[BlacklistAPI.llll[9]] = IlIIll("2jalE9kkFKrR9N4WQivNEA==", "nMCAv");
        BlacklistAPI.Illl[BlacklistAPI.llll[10]] = IlIIll("VeIpXPsAFl4=", "qyNDQ");
        BlacklistAPI.Illl[BlacklistAPI.llll[11]] = lIIIll("MBEXATc=", "quzhY");
        BlacklistAPI.Illl[BlacklistAPI.llll[12]] = lIIIll("Sw==", "pWjjL");
        BlacklistAPI.Illl[BlacklistAPI.llll[13]] = IlIIll("1cF9PrUTgdw=", "hamEH");
    }
    
    private static boolean IllIll(final int lIIIIllllIlllll, final int IIIIIllllIlllll) {
        return lIIIIllllIlllll < IIIIIllllIlllll;
    }
    
    private static String IlIIll(final String IllIlllllIlllll, final String llIIlllllIlllll) {
        try {
            final SecretKeySpec lIIllllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllllIlllll.getBytes(StandardCharsets.UTF_8)), BlacklistAPI.llll[8]), "DES");
            final Cipher IIIllllllIlllll = Cipher.getInstance("DES");
            IIIllllllIlllll.init(BlacklistAPI.llll[2], lIIllllllIlllll);
            return new String(IIIllllllIlllll.doFinal(Base64.getDecoder().decode(IllIlllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllllIlllll) {
            lllIlllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void IIlIll() {
        (llll = new int[15])[0] = ((0xE ^ 0x43) & ~(0x39 ^ 0x74));
        BlacklistAPI.llll[1] = " ".length();
        BlacklistAPI.llll[2] = "  ".length();
        BlacklistAPI.llll[3] = "   ".length();
        BlacklistAPI.llll[4] = (0xE5 ^ 0xBA ^ (0xD8 ^ 0x83));
        BlacklistAPI.llll[5] = (0x54 ^ 0x51);
        BlacklistAPI.llll[6] = (0xF ^ 0x61 ^ (0x51 ^ 0x39));
        BlacklistAPI.llll[7] = (89 + 26 + 15 + 23 ^ 85 + 91 - 154 + 136);
        BlacklistAPI.llll[8] = (0xD1 ^ 0xBA ^ (0xC3 ^ 0xA0));
        BlacklistAPI.llll[9] = (0xCD ^ 0xC4);
        BlacklistAPI.llll[10] = (61 + 113 - 98 + 112 ^ 142 + 173 - 142 + 9);
        BlacklistAPI.llll[11] = (0x4D ^ 0x46);
        BlacklistAPI.llll[12] = (0x2C ^ 0x50 ^ (0x26 ^ 0x56));
        BlacklistAPI.llll[13] = (0xA3 ^ 0x85 ^ (0xAD ^ 0x86));
        BlacklistAPI.llll[14] = (52 + 53 - 15 + 77 ^ 128 + 46 - 103 + 98);
    }
    
    private static boolean lIlIll(final int IllllIlllIlllll) {
        return IllllIlllIlllll != 0;
    }
    
    private static String IIIIll(final String lIIlIllllIlllll, final String IIIlIllllIlllll) {
        try {
            final SecretKeySpec IIllIllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIllllIlllll = Cipher.getInstance("Blowfish");
            llIlIllllIlllll.init(BlacklistAPI.llll[2], IIllIllllIlllll);
            return new String(llIlIllllIlllll.doFinal(Base64.getDecoder().decode(lIIlIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIllllIlllll) {
            IlIlIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIll(String IllIIIIIIllllll, final String IlIlIIIIIllllll) {
        IllIIIIIIllllll = new String(Base64.getDecoder().decode(IllIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIlIIIIIllllll = new StringBuilder();
        final char[] IIIlIIIIIllllll = IlIlIIIIIllllll.toCharArray();
        int lllIIIIIIllllll = BlacklistAPI.llll[0];
        final float lIIIIIIIIllllll = (Object)IllIIIIIIllllll.toCharArray();
        final int IIIIIIIIIllllll = lIIIIIIIIllllll.length;
        double lllllllllIlllll = BlacklistAPI.llll[0];
        while (IllIll((int)lllllllllIlllll, IIIIIIIIIllllll)) {
            final char IIllIIIIIllllll = lIIIIIIIIllllll[lllllllllIlllll];
            lIIlIIIIIllllll.append((char)(IIllIIIIIllllll ^ IIIlIIIIIllllll[lllIIIIIIllllll % IIIlIIIIIllllll.length]));
            "".length();
            ++lllIIIIIIllllll;
            ++lllllllllIlllll;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lIIlIIIIIllllll);
    }
    
    public static void setUnBlacklist(final String lIlIIlIIIllllll) {
        final File IIlIIlIIIllllll = new File(String.valueOf(new StringBuilder().append(BlacklistAPI.Illl[BlacklistAPI.llll[5]]).append(Main.getPlugin().getName()).append(BlacklistAPI.Illl[BlacklistAPI.llll[6]]).append(lIlIIlIIIllllll).append(BlacklistAPI.Illl[BlacklistAPI.llll[7]])));
        IIlIIlIIIllllll.delete();
        "".length();
    }
}
