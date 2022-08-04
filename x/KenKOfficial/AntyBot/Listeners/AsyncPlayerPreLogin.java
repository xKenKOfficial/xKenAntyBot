package x.KenKOfficial.AntyBot.Listeners;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import org.bukkit.event.EventHandler;
import x.KenKOfficial.AntyBot.Utils.ChatUtil;
import x.KenKOfficial.AntyBot.Apis.BotCheckerAPI;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import x.KenKOfficial.AntyBot.Basic.Main;
import org.bukkit.event.Listener;

public class AsyncPlayerPreLogin implements Listener
{
    private static final /* synthetic */ String KICK_OTHER;
    private static final /* synthetic */ int[] IlIll;
    private static final /* synthetic */ String[] lIIll;
    
    private static boolean llIllIl(final int IIIllIIlIIlllll, final int lllIlIIlIIlllll) {
        return IIIllIIlIIlllll <= lllIlIIlIIlllll;
    }
    
    private static void lllIlIl() {
        (IlIll = new int[12])[0] = ((0x9F ^ 0x8D) & ~(0x9 ^ 0x1B));
        AsyncPlayerPreLogin.IlIll[1] = " ".length();
        AsyncPlayerPreLogin.IlIll[2] = "  ".length();
        AsyncPlayerPreLogin.IlIll[3] = "   ".length();
        AsyncPlayerPreLogin.IlIll[4] = (0x6B ^ 0x6F);
        AsyncPlayerPreLogin.IlIll[5] = ("  ".length() ^ (0x4F ^ 0x48));
        AsyncPlayerPreLogin.IlIll[6] = (0xCF ^ 0x91 ^ (0x30 ^ 0x68));
        AsyncPlayerPreLogin.IlIll[7] = (0xFE ^ 0x9C ^ (0x62 ^ 0x7));
        AsyncPlayerPreLogin.IlIll[8] = (0x55 ^ 0x5D);
        AsyncPlayerPreLogin.IlIll[9] = (0xD ^ 0x4);
        AsyncPlayerPreLogin.IlIll[10] = (0x16 ^ 0x10 ^ (0x55 ^ 0x59));
        AsyncPlayerPreLogin.IlIll[11] = (71 + 76 + 19 + 9 ^ 29 + 78 - 17 + 74);
    }
    
    static {
        lllIlIl();
        IllIlIl();
        KICK_OTHER = Main.getPlugin().getConfig().getString(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[10]]);
    }
    
    @EventHandler
    public void onLogin(final AsyncPlayerPreLoginEvent lllIIlllIIlllll) {
        final String IllIIlllIIlllll = lllIIlllIIlllll.getName();
        if (IIIllIl(BotCheckerAPI.PlayedBefore(IllIIlllIIlllll) ? 1 : 0)) {
            lllIIlllIIlllll.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, ChatUtil.fixColor(AsyncPlayerPreLogin.KICK_OTHER));
        }
    }
    
    private static boolean lIIllIl(final int lIlIlIIlIIlllll) {
        return lIlIlIIlIIlllll != 0;
    }
    
    @EventHandler
    public void onBlacklist(final AsyncPlayerPreLoginEvent IIIllIllIIlllll) {
        final File lllIlIllIIlllll = new File(String.valueOf(new StringBuilder().append(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[0]]).append(Main.getPlugin().getName()).append(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[1]]).append(IIIllIllIIlllll.getAddress().getHostAddress()).append(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[2]])));
        if (lIIllIl(lllIlIllIIlllll.exists() ? 1 : 0)) {
            final YamlConfiguration IIlllIllIIlllll = YamlConfiguration.loadConfiguration(lllIlIllIIlllll);
            final List<String> llIllIllIIlllll = (List<String>)Main.getPlugin().getConfig().getStringList(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[3]]);
            String IlIllIllIIlllll = AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[4]];
            int lIlllIllIIlllll = AsyncPlayerPreLogin.IlIll[0];
            while (IlIllIl(lIlllIllIIlllll, llIllIllIIlllll.size())) {
                IlIllIllIIlllll = String.valueOf(new StringBuilder().append(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(IlIllIllIIlllll))))))).append(llIllIllIIlllll.get(lIlllIllIIlllll)));
                if (llIllIl(lIlllIllIIlllll, llIllIllIIlllll.size() - AsyncPlayerPreLogin.IlIll[2])) {
                    IlIllIllIIlllll = String.valueOf(new StringBuilder().append(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(IlIllIllIIlllll))))))).append(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[5]]));
                }
                ++lIlllIllIIlllll;
                "".length();
                if (" ".length() <= ((0x4A ^ 0x61 ^ (0x44 ^ 0x4E)) & (182 + 183 - 356 + 178 ^ 82 + 43 - 54 + 83 ^ -" ".length()))) {
                    return;
                }
            }
            IlIllIllIIlllll = IlIllIllIIlllll.replace(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[6]], IIlllIllIIlllll.getString(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[7]]));
            IlIllIllIIlllll = IlIllIllIIlllll.replace(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[8]], IIlllIllIIlllll.getString(AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[9]]));
            IIIllIllIIlllll.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, ChatUtil.fixColor(IlIllIllIIlllll));
        }
    }
    
    private static boolean IlIllIl(final int IIlllIIlIIlllll, final int llIllIIlIIlllll) {
        return IIlllIIlIIlllll < llIllIIlIIlllll;
    }
    
    private static String llIIlIl(final String llllIlIlIIlllll, final String IIIIllIlIIlllll) {
        try {
            final SecretKeySpec IIlIllIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIllIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIllIlIIlllll = Cipher.getInstance("Blowfish");
            llIIllIlIIlllll.init(AsyncPlayerPreLogin.IlIll[2], IIlIllIlIIlllll);
            return new String(llIIllIlIIlllll.doFinal(Base64.getDecoder().decode(llllIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIllIlIIlllll) {
            IlIIllIlIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIIllIl(final int llIIlIIlIIlllll) {
        return llIIlIIlIIlllll == 0;
    }
    
    private static void IllIlIl() {
        (lIIll = new String[AsyncPlayerPreLogin.IlIll[11]])[AsyncPlayerPreLogin.IlIll[0]] = llIIlIl("IzbdGBigtmBxV/aG6irdmw==", "endze");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[1]] = IIlIlIl("XSH7Sf14RkRSFyHY0BO1pw==", "wHHxt");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[2]] = lIlIlIl("Si0/Aw==", "dTRoY");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[3]] = lIlIlIl("JyQtBh86JipcFDggOhkaPTIt", "TAYrv");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[4]] = IIlIlIl("j/DZYoCIyNk=", "mDlOc");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[5]] = IIlIlIl("d4L3CoWG1x4=", "UahRq");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[6]] = IIlIlIl("dQHLzT0IchI=", "IBdse");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[7]] = IIlIlIl("74vv9GLZgiw=", "joBap");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[8]] = lIlIlIl("DA4NODs5Mg==", "wOIur");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[9]] = llIIlIl("wRBGfDdP0sU=", "kPQcc");
        AsyncPlayerPreLogin.lIIll[AsyncPlayerPreLogin.IlIll[10]] = llIIlIl("lFQww9f2R+pzAICgMxOzbkc12c+wifGj", "QiNtm");
    }
    
    private static String lIlIlIl(String lIIIIIllIIlllll, final String lIlIIIllIIlllll) {
        lIIIIIllIIlllll = new String(Base64.getDecoder().decode(lIIIIIllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIIIllIIlllll = new StringBuilder();
        final char[] llIIIIllIIlllll = lIlIIIllIIlllll.toCharArray();
        int IlIIIIllIIlllll = AsyncPlayerPreLogin.IlIll[0];
        final double IIllllIlIIlllll = (Object)lIIIIIllIIlllll.toCharArray();
        final double llIlllIlIIlllll = IIllllIlIIlllll.length;
        char IlIlllIlIIlllll = (char)AsyncPlayerPreLogin.IlIll[0];
        while (IlIllIl(IlIlllIlIIlllll, (int)llIlllIlIIlllll)) {
            final char lllIIIllIIlllll = IIllllIlIIlllll[IlIlllIlIIlllll];
            IIlIIIllIIlllll.append((char)(lllIIIllIIlllll ^ llIIIIllIIlllll[IlIIIIllIIlllll % llIIIIllIIlllll.length]));
            "".length();
            ++IlIIIIllIIlllll;
            ++IlIlllIlIIlllll;
            "".length();
            if ((0xBD ^ 0xB9) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlIIIllIIlllll);
    }
    
    private static String IIlIlIl(final String IlIIIlIlIIlllll, final String llIIIlIlIIlllll) {
        try {
            final SecretKeySpec lllIIlIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), AsyncPlayerPreLogin.IlIll[8]), "DES");
            final Cipher IllIIlIlIIlllll = Cipher.getInstance("DES");
            IllIIlIlIIlllll.init(AsyncPlayerPreLogin.IlIll[2], lllIIlIlIIlllll);
            return new String(IllIIlIlIIlllll.doFinal(Base64.getDecoder().decode(IlIIIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIlIIlllll) {
            lIlIIlIlIIlllll.printStackTrace();
            return null;
        }
    }
}
