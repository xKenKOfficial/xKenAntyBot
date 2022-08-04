package x.KenKOfficial.AntyBot.Utils.Urls;

import java.net.URLConnection;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionReader
{
    private static final /* synthetic */ int[] IllIl;
    
    private static void IlIlIIl() {
        (IllIl = new int[1])[0] = ((0x4A ^ 0x21 ^ (0x4D ^ 0x2E)) & (0x52 ^ 0x25 ^ 59 + 10 - 58 + 116 ^ -" ".length()));
    }
    
    public static void main(final String[] IIIIIIlIlIlllll) throws Exception {
        final String llllllIIlIlllll = getText(IIIIIIlIlIlllll[URLConnectionReader.IllIl[0]]);
        System.out.println(llllllIIlIlllll);
    }
    
    public static String getText(final String IIIlIIlIlIlllll) throws Exception {
        final URL lIllIIlIlIlllll = new URL(IIIlIIlIlIlllll);
        final URLConnection IIllIIlIlIlllll = lIllIIlIlIlllll.openConnection();
        final BufferedReader llIlIIlIlIlllll = new BufferedReader(new InputStreamReader(IIllIIlIlIlllll.getInputStream()));
        final StringBuilder IlIlIIlIlIlllll = new StringBuilder();
        String lIIlIIlIlIlllll;
        while (llIlIIl(lIIlIIlIlIlllll = llIlIIlIlIlllll.readLine())) {
            IlIlIIlIlIlllll.append(lIIlIIlIlIlllll);
            "".length();
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        llIlIIlIlIlllll.close();
        return String.valueOf(IlIlIIlIlIlllll);
    }
    
    private static boolean llIlIIl(final Object llIlllIIlIlllll) {
        return llIlllIIlIlllll != null;
    }
    
    static {
        IlIlIIl();
    }
}
