package x.KenKOfficial.AntyBot.Apis;

import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CountryAPI
{
    private static final /* synthetic */ int[] lIll;
    private static final /* synthetic */ String[] IIll;
    
    private static void IlIlIl() {
        (lIll = new int[5])[0] = ((0xFB ^ 0xC3) & ~(0x23 ^ 0x1B));
        CountryAPI.lIll[1] = " ".length();
        CountryAPI.lIll[2] = "  ".length();
        CountryAPI.lIll[3] = "   ".length();
        CountryAPI.lIll[4] = (0x1 ^ 0x5);
    }
    
    private static String lllIIl(final String lllllIlIIllllll, final String IIlllIlIIllllll) {
        try {
            final SecretKeySpec IlIIIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlllIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIIllIIllllll = Cipher.getInstance("Blowfish");
            lIIIIllIIllllll.init(CountryAPI.lIll[2], IlIIIllIIllllll);
            return new String(lIIIIllIIllllll.doFinal(Base64.getDecoder().decode(lllllIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIllIIllllll) {
            IIIIIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    public static String country(final String IllIIIIlIllllll) throws IOException {
        Throwable lllIIIIlIllllll = null;
        try {
            final Scanner IlIlIIIlIllllll = new Scanner(new URL(String.valueOf(new StringBuilder().append(CountryAPI.IIll[CountryAPI.lIll[0]]).append(IllIIIIlIllllll).append(CountryAPI.IIll[CountryAPI.lIll[1]]))).openStream(), StandardCharsets.UTF_8.toString());
            try {
                IlIlIIIlIllllll.useDelimiter(CountryAPI.IIll[CountryAPI.lIll[2]]);
                "".length();
                String next;
                if (llIlIl(IlIlIIIlIllllll.hasNext() ? 1 : 0)) {
                    next = IlIlIIIlIllllll.next();
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                }
                else {
                    next = CountryAPI.IIll[CountryAPI.lIll[3]];
                }
                final String llIIIIIlIllllll = next;
                if (IIllIl(IlIlIIIlIllllll)) {
                    IlIlIIIlIllllll.close();
                }
                if (lIllIl(lllIIIIlIllllll)) {
                    lllIIIIlIllllll = null;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                else {
                    final Throwable llIlIIIlIllllll = null;
                    if (IlllIl(lllIIIIlIllllll, llIlIIIlIllllll)) {
                        lllIIIIlIllllll.addSuppressed(llIlIIIlIllllll);
                    }
                }
                return llIIIIIlIllllll;
            }
            finally {
                if (IIllIl(IlIlIIIlIllllll)) {
                    IlIlIIIlIllllll.close();
                }
            }
        }
        finally {
            if (lIllIl(lllIIIIlIllllll)) {
                lllIIIIlIllllll = null;
                "".length();
                if (-(58 + 72 - 70 + 75 ^ 91 + 13 + 1 + 25) >= 0) {
                    return null;
                }
            }
            else {
                final Throwable lIIlIIIlIllllll = null;
                if (IlllIl(lllIIIIlIllllll, lIIlIIIlIllllll)) {
                    lllIIIIlIllllll.addSuppressed(lIIlIIIlIllllll);
                }
            }
        }
    }
    
    private static String IIIlIl(String llllIllIIllllll, final String llIIlllIIllllll) {
        llllIllIIllllll = (double)new String(Base64.getDecoder().decode(((String)llllIllIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIlllIIllllll = new StringBuilder();
        final char[] lIIIlllIIllllll = llIIlllIIllllll.toCharArray();
        int IIIIlllIIllllll = CountryAPI.lIll[0];
        final byte IlIlIllIIllllll = (Object)((String)llllIllIIllllll).toCharArray();
        final Exception lIIlIllIIllllll = (Exception)IlIlIllIIllllll.length;
        short IIIlIllIIllllll = (short)CountryAPI.lIll[0];
        while (llllIl(IIIlIllIIllllll, (int)lIIlIllIIllllll)) {
            final char lIlIlllIIllllll = IlIlIllIIllllll[IIIlIllIIllllll];
            IlIIlllIIllllll.append((char)(lIlIlllIIllllll ^ lIIIlllIIllllll[IIIIlllIIllllll % lIIIlllIIllllll.length]));
            "".length();
            ++IIIIlllIIllllll;
            ++IIIlIllIIllllll;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIIlllIIllllll);
    }
    
    private static boolean IlllIl(final Object llIIlIlIIllllll, final Object IlIIlIlIIllllll) {
        return llIIlIlIIllllll != IlIIlIlIIllllll;
    }
    
    private static boolean llllIl(final int lllIlIlIIllllll, final int IllIlIlIIllllll) {
        return lllIlIlIIllllll < IllIlIlIIllllll;
    }
    
    private static boolean IIllIl(final Object IIIIlIlIIllllll) {
        return IIIIlIlIIllllll != null;
    }
    
    private static void lIIlIl() {
        (IIll = new String[CountryAPI.lIll[4]])[CountryAPI.lIll[0]] = lllIIl("neIQQTQzmGqwxB53eHy49Iqb0pHv01l1", "HjwxF");
        CountryAPI.IIll[CountryAPI.lIll[1]] = lllIIl("D4YWxy4HsIqqdGXkPNZTCw==", "hRvRT");
        CountryAPI.IIll[CountryAPI.lIll[2]] = lllIIl("8td/7W7hllU=", "YfgvM");
        CountryAPI.IIll[CountryAPI.lIll[3]] = IIIlIl("", "jXnWi");
    }
    
    private static boolean lIllIl(final Object IlllIIlIIllllll) {
        return IlllIIlIIllllll == null;
    }
    
    static {
        IlIlIl();
        lIIlIl();
    }
    
    private static boolean llIlIl(final int IIllIIlIIllllll) {
        return IIllIIlIIllllll != 0;
    }
}
