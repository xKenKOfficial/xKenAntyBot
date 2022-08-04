package x.KenKOfficial.AntyBot.Utils;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class NameUtil
{
    private static final /* synthetic */ int[] lIIIl;
    private static final /* synthetic */ String[] IIIIl;
    
    static {
        llIlll();
        IlIlll();
    }
    
    public static String fixColor(final String lIIllIlllIlllll) {
        return lIIllIlllIlllll.replaceAll(NameUtil.IIIIl[NameUtil.lIIIl[0]], NameUtil.IIIIl[NameUtil.lIIIl[1]]).replace(NameUtil.IIIIl[NameUtil.lIIIl[2]], NameUtil.IIIIl[NameUtil.lIIIl[3]]).replace(NameUtil.IIIIl[NameUtil.lIIIl[4]], NameUtil.IIIIl[NameUtil.lIIIl[5]]).replace(NameUtil.IIIIl[NameUtil.lIIIl[6]], NameUtil.IIIIl[NameUtil.lIIIl[7]]);
    }
    
    private static String lIIlll(final String IlllIIlllIlllll, final String lIllIIlllIlllll) {
        try {
            final SecretKeySpec llIIlIlllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), NameUtil.lIIIl[8]), "DES");
            final Cipher IlIIlIlllIlllll = Cipher.getInstance("DES");
            IlIIlIlllIlllll.init(NameUtil.lIIIl[2], llIIlIlllIlllll);
            return new String(IlIIlIlllIlllll.doFinal(Base64.getDecoder().decode(IlllIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlllIlllll) {
            lIIIlIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIll(String IlllIlIllIlllll, final String IlIIllIllIlllll) {
        IlllIlIllIlllll = (short)new String(Base64.getDecoder().decode(((String)IlllIlIllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIllIllIlllll = new StringBuilder();
        final char[] IIIIllIllIlllll = IlIIllIllIlllll.toCharArray();
        int llllIlIllIlllll = NameUtil.lIIIl[0];
        final float lIIlIlIllIlllll = (Object)((String)IlllIlIllIlllll).toCharArray();
        final short IIIlIlIllIlllll = (short)lIIlIlIllIlllll.length;
        String lllIIlIllIlllll = (String)NameUtil.lIIIl[0];
        while (IIllll((int)lllIIlIllIlllll, IIIlIlIllIlllll)) {
            final char IIlIllIllIlllll = lIIlIlIllIlllll[lllIIlIllIlllll];
            lIIIllIllIlllll.append((char)(IIlIllIllIlllll ^ IIIIllIllIlllll[llllIlIllIlllll % IIIIllIllIlllll.length]));
            "".length();
            ++llllIlIllIlllll;
            ++lllIIlIllIlllll;
            "".length();
            if (-(0x72 ^ 0x4E ^ (0x18 ^ 0x21)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lIIIllIllIlllll);
    }
    
    private static void IlIlll() {
        (IIIIl = new String[NameUtil.lIIIl[8]])[NameUtil.lIIIl[0]] = lllIll("dg==", "Pjvfy");
        NameUtil.IIIIl[NameUtil.lIIIl[1]] = lllIll("w6w=", "KoYfC");
        NameUtil.IIIIl[NameUtil.lIIIl[2]] = IIIlll("Jtxi8DrnUII=", "UDaUL");
        NameUtil.IIIIl[NameUtil.lIIIl[3]] = lllIll("w4g=", "svnlP");
        NameUtil.IIIIl[NameUtil.lIIIl[4]] = IIIlll("bsIOISr4VD0=", "NcHCn");
        NameUtil.IIIIl[NameUtil.lIIIl[5]] = lllIll("w4M=", "hzhbt");
        NameUtil.IIIIl[NameUtil.lIIIl[6]] = lllIll("HTox", "ftLhe");
        NameUtil.IIIIl[NameUtil.lIIIl[7]] = lIIlll("af5h3ZKPlk8=", "pHOQD");
    }
    
    private static boolean IIllll(final int llIIIlIllIlllll, final int IlIIIlIllIlllll) {
        return llIIIlIllIlllll < IlIIIlIllIlllll;
    }
    
    private static String IIIlll(final String lIIIIIlllIlllll, final String IlIIIIlllIlllll) {
        try {
            final SecretKeySpec IllIIIlllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlIIIlllIlllll = Cipher.getInstance("Blowfish");
            lIlIIIlllIlllll.init(NameUtil.lIIIl[2], IllIIIlllIlllll);
            return new String(lIlIIIlllIlllll.doFinal(Base64.getDecoder().decode(lIIIIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIIlllIlllll) {
            IIlIIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlll() {
        (lIIIl = new int[9])[0] = ((0x93 ^ 0xBF ^ (0x2A ^ 0x5E)) & (0xAE ^ 0x9E ^ (0xFF ^ 0x97) ^ -" ".length()));
        NameUtil.lIIIl[1] = " ".length();
        NameUtil.lIIIl[2] = "  ".length();
        NameUtil.lIIIl[3] = "   ".length();
        NameUtil.lIIIl[4] = (0x9 ^ 0x7 ^ (0x13 ^ 0x19));
        NameUtil.lIIIl[5] = (25 + 111 - 11 + 38 ^ 88 + 9 - 17 + 86);
        NameUtil.lIIIl[6] = (176 + 74 - 217 + 157 ^ 127 + 16 - 30 + 71);
        NameUtil.lIIIl[7] = (0x7 ^ 0x61 ^ (0xC1 ^ 0xA0));
        NameUtil.lIIIl[8] = (0x6D ^ 0x65);
    }
}
