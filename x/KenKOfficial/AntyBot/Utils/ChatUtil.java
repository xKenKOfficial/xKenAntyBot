package x.KenKOfficial.AntyBot.Utils;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChatUtil
{
    private static final /* synthetic */ String[] Il;
    private static final /* synthetic */ int[] ll;
    
    private static String lll(String lIlllIIllllllll, final String IIlllIIllllllll) {
        lIlllIIllllllll = new String(Base64.getDecoder().decode(lIlllIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIlIllllllll = new StringBuilder();
        final char[] lllllIIllllllll = IIlllIIllllllll.toCharArray();
        int IllllIIllllllll = ChatUtil.ll[0];
        final boolean IIIllIIllllllll = (Object)lIlllIIllllllll.toCharArray();
        final int lllIlIIllllllll = IIIllIIllllllll.length;
        long IllIlIIllllllll = ChatUtil.ll[0];
        while (IIll((int)IllIlIIllllllll, lllIlIIllllllll)) {
            final char llIIIlIllllllll = IIIllIIllllllll[IllIlIIllllllll];
            IIIIIlIllllllll.append((char)(llIIIlIllllllll ^ lllllIIllllllll[IllllIIllllllll % lllllIIllllllll.length]));
            "".length();
            ++IllllIIllllllll;
            ++IllIlIIllllllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(IIIIIlIllllllll);
    }
    
    public static String fixColor(final String lllIIIlllllllll) {
        return lllIIIlllllllll.replaceAll(ChatUtil.Il[ChatUtil.ll[0]], ChatUtil.Il[ChatUtil.ll[1]]).replace(ChatUtil.Il[ChatUtil.ll[2]], ChatUtil.Il[ChatUtil.ll[3]]).replace(ChatUtil.Il[ChatUtil.ll[4]], ChatUtil.Il[ChatUtil.ll[5]]).replace(ChatUtil.Il[ChatUtil.ll[6]], ChatUtil.Il[ChatUtil.ll[7]]);
    }
    
    private static boolean IIll(final int IlIIlIIllllllll, final int lIIIlIIllllllll) {
        return IlIIlIIllllllll < lIIIlIIllllllll;
    }
    
    private static void llIl() {
        (ll = new int[9])[0] = ((83 + 56 - 86 + 134 ^ 23 + 110 - 57 + 92) & (99 + 71 - 138 + 180 ^ 188 + 142 - 172 + 41 ^ -" ".length()));
        ChatUtil.ll[1] = " ".length();
        ChatUtil.ll[2] = "  ".length();
        ChatUtil.ll[3] = "   ".length();
        ChatUtil.ll[4] = (0xC4 ^ 0xC0);
        ChatUtil.ll[5] = (0xE6 ^ 0x86 ^ (0xF8 ^ 0x9D));
        ChatUtil.ll[6] = (0x68 ^ 0x6E);
        ChatUtil.ll[7] = (0x2F ^ 0x16 ^ (0x2E ^ 0x10));
        ChatUtil.ll[8] = (0x46 ^ 0x4E);
    }
    
    private static String lIIl(final String IlIIllIllllllll, final String lIIIllIllllllll) {
        try {
            final SecretKeySpec lIlIllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIllIllllllll = Cipher.getInstance("Blowfish");
            IIlIllIllllllll.init(ChatUtil.ll[2], lIlIllIllllllll);
            return new String(IIlIllIllllllll.doFinal(Base64.getDecoder().decode(IlIIllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIllllllll) {
            llIIllIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIIl(final String lIllllIllllllll, final String IlllllIllllllll) {
        try {
            final SecretKeySpec IlIIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlllllIllllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.ll[8]), "DES");
            final Cipher lIIIIIlllllllll = Cipher.getInstance("DES");
            lIIIIIlllllllll.init(ChatUtil.ll[2], IlIIIIlllllllll);
            return new String(lIIIIIlllllllll.doFinal(Base64.getDecoder().decode(lIllllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIlllllllll) {
            IIIIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIl();
        IlIl();
    }
    
    private static void IlIl() {
        (Il = new String[ChatUtil.ll[8]])[ChatUtil.ll[0]] = lll("TA==", "jylta");
        ChatUtil.Il[ChatUtil.ll[1]] = lll("w5c=", "pviFR");
        ChatUtil.Il[ChatUtil.ll[2]] = IIIl("r7lKnijVp0s=", "vzkBS");
        ChatUtil.Il[ChatUtil.ll[3]] = IIIl("UygOIaS286I=", "UKKxM");
        ChatUtil.Il[ChatUtil.ll[4]] = lIIl("lCpWljpnqmk=", "qAhTT");
        ChatUtil.Il[ChatUtil.ll[5]] = IIIl("6uIYRK+SjCw=", "CjzLb");
        ChatUtil.Il[ChatUtil.ll[6]] = lIIl("ixL6KgktxIo=", "BcuUp");
        ChatUtil.Il[ChatUtil.ll[7]] = lll("Qg==", "HlskK");
    }
}
