package x.KenKOfficial.AntyBot.Commands;

import x.KenKOfficial.AntyBot.Apis.BlacklistAPI;
import x.KenKOfficial.AntyBot.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import x.KenKOfficial.AntyBot.Basic.Main;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.command.CommandExecutor;

public class UnBlacklistCommand implements CommandExecutor
{
    private static final /* synthetic */ String UNBANNED_IP;
    private static final /* synthetic */ String WRONG_IP;
    private static final /* synthetic */ String[] IlIIl;
    private static final /* synthetic */ String COMMAND_USAGE;
    private static final /* synthetic */ int[] llIIl;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String NO_PERM;
    
    private static String lIllll(String lIIllllIlIlllll, final String lIlllllIlIlllll) {
        lIIllllIlIlllll = (double)new String(Base64.getDecoder().decode(((String)lIIllllIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlllllIlIlllll = new StringBuilder();
        final char[] llIllllIlIlllll = lIlllllIlIlllll.toCharArray();
        int IlIllllIlIlllll = UnBlacklistCommand.llIIl[0];
        final char IIlIlllIlIlllll = (Object)((String)lIIllllIlIlllll).toCharArray();
        final boolean llIIlllIlIlllll = IIlIlllIlIlllll.length != 0;
        double IlIIlllIlIlllll = UnBlacklistCommand.llIIl[0];
        while (llIIIIl((int)IlIIlllIlIlllll, llIIlllIlIlllll ? 1 : 0)) {
            final char lllllllIlIlllll = IIlIlllIlIlllll[IlIIlllIlIlllll];
            IIlllllIlIlllll.append((char)(lllllllIlIlllll ^ llIllllIlIlllll[IlIllllIlIlllll % llIllllIlIlllll.length]));
            "".length();
            ++IlIllllIlIlllll;
            ++IlIIlllIlIlllll;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlllllIlIlllll);
    }
    
    private static void IIIIIIl() {
        (IlIIl = new String[UnBlacklistCommand.llIIl[11]])[UnBlacklistCommand.llIIl[0]] = lIllll("CBwXNxQeAws7GgRZEz0YGRlcLBsSGxM6HhweAS0=", "pwrYu");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[1]] = lIllll("dw==", "WAwpX");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[2]] = Illlll("wOx728Za7hI=", "NVIlG");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[3]] = llllll("tH+6WhTZx+c=", "icUav");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[4]] = Illlll("k3EYtOOAFo8=", "yLaAl");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[5]] = lIllll("YQ==", "Aucmq");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[6]] = Illlll("meu7nJHqsQg=", "lwatw");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[7]] = lIllll("Cgc7AhMWBQ0BBQ0HCg==", "dhdrv");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[8]] = lIllll("FxwqCxUBGSQOBxYtKwgZDxMmAysXASkAEQ==", "brHgt");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[9]] = lIllll("JAUpIxYyACcmBCU0PiEVMAUlKhMOAjs=", "QkKOw");
        UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[10]] = lIllll("DCsTLRcaLh0oBQ0aBjMZFyIuKAY=", "yEqAv");
    }
    
    private static String llllll(final String lIIlIllIlIlllll, final String IIIlIllIlIlllll) {
        try {
            final SecretKeySpec IIllIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIllIlIlllll.getBytes(StandardCharsets.UTF_8)), UnBlacklistCommand.llIIl[8]), "DES");
            final Cipher llIlIllIlIlllll = Cipher.getInstance("DES");
            llIlIllIlIlllll.init(UnBlacklistCommand.llIIl[2], IIllIllIlIlllll);
            return new String(llIlIllIlIlllll.doFinal(Base64.getDecoder().decode(lIIlIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIllIlIlllll) {
            IlIlIllIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlIIIl(final int lIIIIllIlIlllll, final int IIIIIllIlIlllll) {
        return lIIIIllIlIlllll == IIIIIllIlIlllll;
    }
    
    private static boolean lIlIIIl(final int IlIllIlIlIlllll) {
        return IlIllIlIlIlllll != 0;
    }
    
    private static String Illlll(final String IlllIIIllIlllll, final String llIlIIIllIlllll) {
        try {
            final SecretKeySpec lIIIlIIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIlIIllIlllll = Cipher.getInstance("Blowfish");
            IIIIlIIllIlllll.init(UnBlacklistCommand.llIIl[2], lIIIlIIllIlllll);
            return new String(IIIIlIIllIlllll.doFinal(Base64.getDecoder().decode(IlllIIIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIllIlllll) {
            llllIIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IlIIIIl(final int IIIllIlIlIlllll) {
        return IIIllIlIlIlllll == 0;
    }
    
    static {
        lIIIIIl();
        IIIIIIl();
        PREFIX = Main.getPlugin().getConfig().getString(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[6]]);
        NO_PERM = Main.getPlugin().getConfig().getString(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[7]]);
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[8]]);
        UNBANNED_IP = Main.getPlugin().getConfig().getString(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[9]]);
        WRONG_IP = Main.getPlugin().getConfig().getString(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[10]]);
    }
    
    public boolean onCommand(final CommandSender llIllIIllIlllll, final Command IlIllIIllIlllll, final String lIIllIIllIlllll, final String[] IllIlIIllIlllll) {
        if (IlIIIIl(llIllIIllIlllll.hasPermission(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[0]]) ? 1 : 0)) {
            llIllIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBlacklistCommand.PREFIX).append(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[1]]).append(UnBlacklistCommand.NO_PERM))));
            return UnBlacklistCommand.llIIl[0] != 0;
        }
        if (llIIIIl(IllIlIIllIlllll.length, UnBlacklistCommand.llIIl[1])) {
            llIllIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBlacklistCommand.PREFIX).append(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[2]]).append(UnBlacklistCommand.COMMAND_USAGE))));
            return UnBlacklistCommand.llIIl[0] != 0;
        }
        if (IIlIIIl(IllIlIIllIlllll.length, UnBlacklistCommand.llIIl[1])) {
            if (lIlIIIl(BlacklistCommand.ipValidity.matcher(IllIlIIllIlllll[UnBlacklistCommand.llIIl[0]]).matches() ? 1 : 0)) {
                BlacklistAPI.setUnBlacklist(IllIlIIllIlllll[UnBlacklistCommand.llIIl[0]]);
                llIllIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBlacklistCommand.PREFIX).append(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[3]]).append(UnBlacklistCommand.UNBANNED_IP.replace(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[4]], IllIlIIllIlllll[UnBlacklistCommand.llIIl[0]])))));
                "".length();
                if (((0xEE ^ 0x8B ^ (0x41 ^ 0x32)) & (139 + 99 - 106 + 20 ^ 39 + 111 - 108 + 100 ^ -" ".length())) != 0x0) {
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                llIllIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBlacklistCommand.PREFIX).append(UnBlacklistCommand.IlIIl[UnBlacklistCommand.llIIl[5]]).append(UnBlacklistCommand.WRONG_IP))));
            }
        }
        return UnBlacklistCommand.llIIl[0] != 0;
    }
    
    private static void lIIIIIl() {
        (llIIl = new int[12])[0] = ((0xE ^ 0x4A ^ (0x8D ^ 0xAB)) & (45 + 69 - 66 + 114 ^ 131 + 13 - 19 + 67 ^ -" ".length()));
        UnBlacklistCommand.llIIl[1] = " ".length();
        UnBlacklistCommand.llIIl[2] = "  ".length();
        UnBlacklistCommand.llIIl[3] = "   ".length();
        UnBlacklistCommand.llIIl[4] = (0x2E ^ 0x3 ^ (0xB ^ 0x22));
        UnBlacklistCommand.llIIl[5] = (0xC1 ^ 0xC4);
        UnBlacklistCommand.llIIl[6] = (0xC7 ^ 0xC1);
        UnBlacklistCommand.llIIl[7] = (0x5 ^ 0x7B ^ (0x4A ^ 0x33));
        UnBlacklistCommand.llIIl[8] = (63 + 56 - 30 + 62 ^ 92 + 116 - 62 + 13);
        UnBlacklistCommand.llIIl[9] = (0x6C ^ 0x3C ^ (0xC2 ^ 0x9B));
        UnBlacklistCommand.llIIl[10] = (0xFC ^ 0xC2 ^ (0xF3 ^ 0xC7));
        UnBlacklistCommand.llIIl[11] = (0x59 ^ 0x52);
    }
    
    private static boolean llIIIIl(final int lIlllIlIlIlllll, final int IIlllIlIlIlllll) {
        return lIlllIlIlIlllll < IIlllIlIlIlllll;
    }
}
