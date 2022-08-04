package x.KenKOfficial.AntyBot.Utils;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class LoreUtil
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    
    public static String fix(final String IIllIIIllllllll) {
        return IIllIIIllllllll.replaceAll(LoreUtil.IIl[LoreUtil.lIl[0]], LoreUtil.IIl[LoreUtil.lIl[1]]).replace(LoreUtil.IIl[LoreUtil.lIl[2]], LoreUtil.IIl[LoreUtil.lIl[3]]).replace(LoreUtil.IIl[LoreUtil.lIl[4]], LoreUtil.IIl[LoreUtil.lIl[5]]);
    }
    
    private static boolean IlIIl(final int IIIllIlIlllllll, final int lllIlIlIlllllll) {
        return IIIllIlIlllllll < lllIlIlIlllllll;
    }
    
    private static String lIll(String IIIIlllIlllllll, final String IIlIlllIlllllll) {
        IIIIlllIlllllll = (short)new String(Base64.getDecoder().decode(((String)IIIIlllIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIIlllIlllllll = new StringBuilder();
        final char[] IlIIlllIlllllll = IIlIlllIlllllll.toCharArray();
        int lIIIlllIlllllll = LoreUtil.lIl[0];
        final short llIlIllIlllllll = (Object)((String)IIIIlllIlllllll).toCharArray();
        final char IlIlIllIlllllll = (char)llIlIllIlllllll.length;
        String lIIlIllIlllllll = (String)LoreUtil.lIl[0];
        while (IlIIl((int)lIIlIllIlllllll, IlIlIllIlllllll)) {
            final char IllIlllIlllllll = llIlIllIlllllll[lIIlIllIlllllll];
            llIIlllIlllllll.append((char)(IllIlllIlllllll ^ IlIIlllIlllllll[lIIIlllIlllllll % IlIIlllIlllllll.length]));
            "".length();
            ++lIIIlllIlllllll;
            ++lIIlIllIlllllll;
            "".length();
            if ("   ".length() >= (0x10 ^ 0x14)) {
                return null;
            }
        }
        return String.valueOf(llIIlllIlllllll);
    }
    
    private static boolean lIIIl(final int lIlIlIlIlllllll) {
        return lIlIlIlIlllllll != 0;
    }
    
    public static List<String> fixColors(final List<String> lIlIIIIllllllll) {
        final List<String> IIlIIIIllllllll = new ArrayList<String>();
        final boolean lIIIIIIllllllll = (boolean)lIlIIIIllllllll.iterator();
        while (lIIIl(((Iterator)lIIIIIIllllllll).hasNext() ? 1 : 0)) {
            final String IllIIIIllllllll = ((Iterator<String>)lIIIIIIllllllll).next();
            IIlIIIIllllllll.add(fix(IllIIIIllllllll));
            "".length();
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return IIlIIIIllllllll;
    }
    
    private static void IIIIl() {
        (lIl = new int[7])[0] = ((6 + 27 + 24 + 156 ^ 126 + 32 - 86 + 123) & (32 + 108 - 106 + 94 ^ 53 + 134 - 50 + 13 ^ -" ".length()));
        LoreUtil.lIl[1] = " ".length();
        LoreUtil.lIl[2] = "  ".length();
        LoreUtil.lIl[3] = "   ".length();
        LoreUtil.lIl[4] = (0x42 ^ 0x46);
        LoreUtil.lIl[5] = (0x8F ^ 0x8A);
        LoreUtil.lIl[6] = (0xF1 ^ 0xAF ^ (0x3 ^ 0x5B));
    }
    
    static {
        IIIIl();
        llll();
    }
    
    private static String Illl(final String IllllIlIlllllll, final String lllllIlIlllllll) {
        try {
            final SecretKeySpec llIIIllIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIIllIlllllll = Cipher.getInstance("Blowfish");
            IlIIIllIlllllll.init(LoreUtil.lIl[2], llIIIllIlllllll);
            return new String(IlIIIllIlllllll.doFinal(Base64.getDecoder().decode(IllllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllIlllllll) {
            lIIIIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llll() {
        (IIl = new String[LoreUtil.lIl[6]])[LoreUtil.lIl[0]] = lIll("YA==", "FGTWa");
        LoreUtil.IIl[LoreUtil.lIl[1]] = Illl("zMFv9dtNJ+k=", "meqwz");
        LoreUtil.IIl[LoreUtil.lIl[2]] = lIll("ZG8=", "ZQxlD");
        LoreUtil.IIl[LoreUtil.lIl[3]] = Illl("4xHx5LTNIOQ=", "mzkff");
        LoreUtil.IIl[LoreUtil.lIl[4]] = lIll("RFg=", "xdLDN");
        LoreUtil.IIl[LoreUtil.lIl[5]] = Illl("NyKzH7Blt6E=", "plxMj");
    }
}
