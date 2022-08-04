package x.KenKOfficial.AntyBot.Listeners;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import x.KenKOfficial.AntyBot.Utils.ChatUtil;
import x.KenKOfficial.AntyBot.Basic.Main;
import org.bukkit.command.CommandSender;
import x.KenKOfficial.AntyBot.Utils.Urls.URLConnectionReader;
import x.KenKOfficial.AntyBot.Apis.CountryAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] llIll;
    private static final /* synthetic */ String[] IIlIl;
    
    private static void IIlllIl() {
        (llIll = new int[27])[0] = ((0x23 ^ 0x67) & ~(0x32 ^ 0x76));
        PlayerJoin.llIll[1] = " ".length();
        PlayerJoin.llIll[2] = "  ".length();
        PlayerJoin.llIll[3] = "   ".length();
        PlayerJoin.llIll[4] = (0x3 ^ 0x7);
        PlayerJoin.llIll[5] = (0x14 ^ 0x11);
        PlayerJoin.llIll[6] = (90 + 8 - 61 + 105 ^ 53 + 37 + 3 + 43);
        PlayerJoin.llIll[7] = (0x88 ^ 0x8F);
        PlayerJoin.llIll[8] = (0x9 ^ 0x1);
        PlayerJoin.llIll[9] = (0xA2 ^ 0xAB);
        PlayerJoin.llIll[10] = (114 + 103 - 78 + 46 ^ 173 + 149 - 147 + 4);
        PlayerJoin.llIll[11] = (0x34 ^ 0x3F);
        PlayerJoin.llIll[12] = (0xFF ^ 0x90 ^ (0xFF ^ 0x9C));
        PlayerJoin.llIll[13] = (0xCD ^ 0xC0);
        PlayerJoin.llIll[14] = (0xBC ^ 0xB2);
        PlayerJoin.llIll[15] = (0x81 ^ 0x8E);
        PlayerJoin.llIll[16] = (0x62 ^ 0x72);
        PlayerJoin.llIll[17] = (0x17 ^ 0x6);
        PlayerJoin.llIll[18] = (0x55 ^ 0x1C ^ (0x51 ^ 0xA));
        PlayerJoin.llIll[19] = (0x7 ^ 0x29 ^ (0x24 ^ 0x19));
        PlayerJoin.llIll[20] = (0xF8 ^ 0x91 ^ (0xDD ^ 0xA0));
        PlayerJoin.llIll[21] = (0x3B ^ 0x2E);
        PlayerJoin.llIll[22] = (0xC ^ 0x1A);
        PlayerJoin.llIll[23] = (0x26 ^ 0x31);
        PlayerJoin.llIll[24] = (0x68 ^ 0x70);
        PlayerJoin.llIll[25] = (0x42 ^ 0x5B);
        PlayerJoin.llIll[26] = (0x9E ^ 0xC0 ^ (0x49 ^ 0xD));
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IllIIIIlIIlllll) throws Exception {
        final Player lIIlIIIlIIlllll = IllIIIIlIIlllll.getPlayer();
        Bukkit.getConsoleSender().sendMessage(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[0]]).append(lIIlIIIlIIlllll.getName()).append(PlayerJoin.IIlIl[PlayerJoin.llIll[1]])));
        Bukkit.getConsoleSender().sendMessage(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[2]]).append(lIIlIIIlIIlllll.getUniqueId())));
        Bukkit.getConsoleSender().sendMessage(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[3]]).append(lIIlIIIlIIlllll.getAddress().getAddress().getHostAddress())));
        Bukkit.getConsoleSender().sendMessage(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[4]]).append(CountryAPI.country(lIIlIIIlIIlllll.getAddress().getAddress().getHostAddress()))));
        Bukkit.getConsoleSender().sendMessage(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[5]]).append(lIIlIIIlIIlllll.getName()).append(PlayerJoin.IIlIl[PlayerJoin.llIll[6]])));
        final String IIIlIIIlIIlllll = String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[7]]).append(lIIlIIIlIIlllll.getAddress().getHostName()));
        final String lllIIIIlIIlllll = URLConnectionReader.getText(IIIlIIIlIIlllll);
        if (lIlllIl(lllIIIIlIIlllll.contains(PlayerJoin.IIlIl[PlayerJoin.llIll[8]]) ? 1 : 0)) {
            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[9]]).append(lIIlIIIlIIlllll.getName()).append(PlayerJoin.IIlIl[PlayerJoin.llIll[10]])));
            "".length();
        }
        if (lIlllIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIlIl[PlayerJoin.llIll[11]]) ? 1 : 0) && lIlllIl(lIIlIIIlIIlllll.hasPermission(PlayerJoin.IIlIl[PlayerJoin.llIll[12]]) ? 1 : 0)) {
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[13]]).append(Main.getPlugin().getName()).append(PlayerJoin.IIlIl[PlayerJoin.llIll[14]]))));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[15]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[16]]).append(Main.getPlugin().getName()))));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[17]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[18]]).append(Main.getPlugin().getDescription().getVersion()))));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[19]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[20]]).append(Bukkit.getBukkitVersion()))));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[21]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[22]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIlIl[PlayerJoin.llIll[23]]));
            lIIlIIIlIIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIlIl[PlayerJoin.llIll[24]]).append(Main.getPlugin().getName()).append(PlayerJoin.IIlIl[PlayerJoin.llIll[25]]))));
        }
    }
    
    private static String IllIIIl(String IllllIlIIIlllll, final String IIIllIlIIIlllll) {
        IllllIlIIIlllll = new String(Base64.getDecoder().decode(IllllIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlllIlIIIlllll = new StringBuilder();
        final char[] llIllIlIIIlllll = IIIllIlIIIlllll.toCharArray();
        int IlIllIlIIIlllll = PlayerJoin.llIll[0];
        final double IIlIlIlIIIlllll = (Object)IllllIlIIIlllll.toCharArray();
        final byte llIIlIlIIIlllll = (byte)IIlIlIlIIIlllll.length;
        long IlIIlIlIIIlllll = PlayerJoin.llIll[0];
        while (IllllIl((int)IlIIlIlIIIlllll, llIIlIlIIIlllll)) {
            final char lllllIlIIIlllll = IIlIlIlIIIlllll[IlIIlIlIIIlllll];
            IIlllIlIIIlllll.append((char)(lllllIlIIIlllll ^ llIllIlIIIlllll[IlIllIlIIIlllll % llIllIlIIIlllll.length]));
            "".length();
            ++IlIllIlIIIlllll;
            ++IlIIlIlIIIlllll;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlllIlIIIlllll);
    }
    
    private static String lllIIIl(final String IIllIllIIIlllll, final String lIllIllIIIlllll) {
        try {
            final SecretKeySpec lIIIlllIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIlllIIIlllll = Cipher.getInstance("Blowfish");
            IIIIlllIIIlllll.init(PlayerJoin.llIll[2], lIIIlllIIIlllll);
            return new String(IIIIlllIIIlllll.doFinal(Base64.getDecoder().decode(IIllIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIIlllll) {
            llllIllIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IllllIl(final int IlllIIlIIIlllll, final int lIllIIlIIIlllll) {
        return IlllIIlIIIlllll < lIllIIlIIIlllll;
    }
    
    private static void lIIlIIl() {
        (IIlIl = new String[PlayerJoin.llIll[26]])[PlayerJoin.llIll[0]] = IllIIIl("bFVVZFVsVVVkVXEzSA==", "QhhYh");
        PlayerJoin.IIlIl[PlayerJoin.llIll[1]] = lllIIIl("bIISugx1QgcE0vt4JmvEtg==", "dyNcC");
        PlayerJoin.IIlIl[PlayerJoin.llIll[2]] = IllIIIl("EAwRInBl", "EYXfJ");
        PlayerJoin.IIlIl[PlayerJoin.llIll[3]] = lllIIIl("Wc1fwyGcPlU=", "qtypd");
        PlayerJoin.IIlIl[PlayerJoin.llIll[4]] = lllIIIl("Hb52nbRSagzAVvvRHEQ2pQ==", "COCdO");
        PlayerJoin.IIlIl[PlayerJoin.llIll[5]] = IIIlIIl("r4hnezi613kwam/dOdBBfA==", "xYOEY");
        PlayerJoin.IIlIl[PlayerJoin.llIll[6]] = IIIlIIl("f593pZVhWklY7NbRlzMwSg==", "MMdDz");
        PlayerJoin.IIlIl[PlayerJoin.llIll[7]] = IllIIIl("CRoQCTxbQUsJPQ4WHRonBA0PVyYOQRJLYA==", "andyO");
        PlayerJoin.IIlIl[PlayerJoin.llIll[8]] = IIIlIIl("nQpPs/FhrRo=", "SBeZy");
        PlayerJoin.IIlIl[PlayerJoin.llIll[9]] = IllIIIl("JC4LLCoqKxk7YQ==", "FBjOA");
        PlayerJoin.IIlIl[PlayerJoin.llIll[10]] = lllIIIl("zstlPzg1Q8zaLx9qRyiWqPyNpd1ktep0CMXtMGTo/nc=", "kZInB");
        PlayerJoin.IIlIl[PlayerJoin.llIll[11]] = lllIIIl("HLi6cuTQyfXh4pz+6D+/MQ==", "rSVgC");
        PlayerJoin.IIlIl[PlayerJoin.llIll[12]] = IIIlIIl("P2nEa49p4TcRBbrdmy4GZ6oKkSFySG8YqoiVixTXakg=", "yzvDA");
        PlayerJoin.IIlIl[PlayerJoin.llIll[13]] = IllIIIl("YnNpB3x5dnJWfHl2clZ8eXZyVhpieGkH", "DKOkA");
        PlayerJoin.IIlIl[PlayerJoin.llIll[14]] = IIIlIIl("PhHwMOP/03wPAQ9MkcfiCV1xLvMAxtNx", "tNhjO");
        PlayerJoin.IIlIl[PlayerJoin.llIll[15]] = IIIlIIl("fRDt96WehOk=", "xFSnr");
        PlayerJoin.IIlIl[PlayerJoin.llIll[16]] = IIIlIIl("Hb8a7ZP3UNHTsiUNblC+zg==", "TXJqx");
        PlayerJoin.IIlIl[PlayerJoin.llIll[17]] = IIIlIIl("YU5ix0HDjOI=", "NOgmO");
        PlayerJoin.IIlIl[PlayerJoin.llIll[18]] = IIIlIIl("WFKh8xW/7tVaKiCT0P6O4Q==", "tnjQt");
        PlayerJoin.IIlIl[PlayerJoin.llIll[19]] = IllIIIl("WQ==", "yPxnw");
        PlayerJoin.IIlIl[PlayerJoin.llIll[20]] = IllIIIl("RG1xIiEPOT8BOUQ8IwcrDipmNy0PIC8BflxxZlM6", "dKFuX");
        PlayerJoin.IIlIl[PlayerJoin.llIll[21]] = lllIIIl("ALqK4ixjhR0=", "kYYNr");
        PlayerJoin.IIlIl[PlayerJoin.llIll[22]] = IllIIIl("d09RBSMjCBIkOTZJJyEkIggKIyo2Cgwrdm9TRmwyZ11Iemh5W1Z4YiVHRi0/MxNIamFgU1R+", "WifJP");
        PlayerJoin.IIlIl[PlayerJoin.llIll[23]] = lllIIIl("we/KeXUDp1I=", "RTsVa");
        PlayerJoin.IIlIl[PlayerJoin.llIll[24]] = IllIIIl("UFNXA21LVkxSbUtWTFJtS1ZMUgtQWFcD", "vkqoP");
        PlayerJoin.IIlIl[PlayerJoin.llIll[25]] = IllIIIl("ZX5eCyl+e0VaSX57RVpJfntFWkk=", "CFxgt");
    }
    
    private static String IIIlIIl(final String lIIllllIIIlllll, final String IIIllllIIIlllll) {
        try {
            final SecretKeySpec IllllllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIllllIIIlllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.llIll[8]), "DES");
            final Cipher lIlllllIIIlllll = Cipher.getInstance("DES");
            lIlllllIIIlllll.init(PlayerJoin.llIll[2], IllllllIIIlllll);
            return new String(lIlllllIIIlllll.doFinal(Base64.getDecoder().decode(lIIllllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllllIIIlllll) {
            IIlllllIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIl(final int llIlIIlIIIlllll) {
        return llIlIIlIIIlllll != 0;
    }
    
    static {
        IIlllIl();
        lIIlIIl();
    }
}
