package x.KenKOfficial.AntyBot.Commands;

import java.util.Iterator;
import java.util.Arrays;
import x.KenKOfficial.AntyBot.Apis.BlacklistAPI;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import x.KenKOfficial.AntyBot.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import x.KenKOfficial.AntyBot.Basic.Main;
import java.util.regex.Pattern;
import org.bukkit.command.CommandExecutor;

public class BlacklistCommand implements CommandExecutor
{
    public static final /* synthetic */ Pattern ipValidity;
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ String ADMIN_BANNED_IP;
    private static final /* synthetic */ int[] IIIl;
    private static final /* synthetic */ String PLAYER_KICK;
    private static final /* synthetic */ String COMMAND_USAGE;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String ADMINS_MESSAGE;
    private static final /* synthetic */ String NO_PERM;
    
    private static boolean llIll(final int llIIllllIllllll) {
        return llIIllllIllllll != 0;
    }
    
    private static void IllIl() {
        (Ill = new String[BlacklistCommand.IIIl[22]])[BlacklistCommand.IIIl[0]] = llIIl("xsTMibIg3gj5JAAHVrWQn1f+5/cg+LgmFSWyN5PM28I=", "hVpCY");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[1]] = IIlIl("GaqkgxXgneQ=", "bdxiL");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[2]] = lIlIl("VA==", "toXev");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[3]] = IIlIl("aKubVMlEjg8=", "oUhiC");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[4]] = IIlIl("YIjty28jPrg=", "OVbOY");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[5]] = llIIl("tZ5AkQ4CNHA=", "whblQ");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[6]] = lIlIl("ag==", "JbiOc");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[7]] = lIlIl("ECAgMQ==", "kipLV");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[8]] = lIlIl("GyIwIxQNPSwvGhdnNCkYCid7LxkCKj4hHBA9", "cIUMu");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[9]] = lIlIl("bw==", "ObaPh");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[10]] = lIlIl("KiAyBQsfHA==", "QavHB");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[11]] = lIlIl("HiY5CQ==", "eoitn");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[12]] = IIlIl("Ay4taMKW2ts=", "NSTPP");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[13]] = llIIl("JyLztMsHC34=", "msqkX");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[14]] = IIlIl("5z/mvl6PHNk=", "zGLdy");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[15]] = llIIl("bVBxzbKbrrk=", "VHYvS");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[16]] = IIlIl("uRQTMPCgFFaT0804tlHqcw==", "gGDzs");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[17]] = llIIl("MQDNDVm2SBtMEEM7hdNnwyK3IZMhwZYw", "QcKTm");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[18]] = IIlIl("86JwtG58hsPF6DO1NYx5f9JRXH7JMXHF", "xpdlp");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[19]] = llIIl("An+V+GhaCR+WRnRHHAVzjf995TcaTAL8tevQl2IVjIU=", "EdIJv");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[20]] = lIlIl("LiQCNQggIRAiPC0sDj8NPxcOMxA/KQQz", "LHcVc");
        BlacklistCommand.Ill[BlacklistCommand.IIIl[21]] = lIlIl("EEozc0kTXTQnJCpdFHEjfk9cHiQqHlp2I35PXR5REkxAGEh/P1cfHBIGVz9KFVJFdyUSBhRxTRVSRXYlZz5GayN+UzV8JCo+DHwEfDlYbkwTPgw/Sns5WG5NE0s0bVAVUlkeRxIGNCdHMlAzc1V6PzQnBHxXM3NVez9BZw==", "NbhCx");
    }
    
    private static boolean IIlll(final Object lIlIllllIllllll) {
        return lIlIllllIllllll == null;
    }
    
    static {
        IIIll();
        IllIl();
        PREFIX = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[15]]);
        NO_PERM = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[16]]);
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[17]]);
        PLAYER_KICK = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[18]]);
        ADMIN_BANNED_IP = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[19]]);
        ADMINS_MESSAGE = Main.getPlugin().getConfig().getString(BlacklistCommand.Ill[BlacklistCommand.IIIl[20]]);
        ipValidity = Pattern.compile(BlacklistCommand.Ill[BlacklistCommand.IIIl[21]]);
    }
    
    private static String IIlIl(final String IlllllllIllllll, final String llllllllIllllll) {
        try {
            final SecretKeySpec llIIIIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIIIIIlllllll = Cipher.getInstance("Blowfish");
            IlIIIIIIlllllll.init(BlacklistCommand.IIIl[2], llIIIIIIlllllll);
            return new String(IlIIIIIIlllllll.doFinal(Base64.getDecoder().decode(IlllllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIIlllllll) {
            lIIIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public boolean onCommand(final CommandSender IIIlIIlIlllllll, final Command lllIIIlIlllllll, final String IllIIIlIlllllll, final String[] IIIIIIlIlllllll) {
        if (lIIll(IIIlIIlIlllllll.hasPermission(BlacklistCommand.Ill[BlacklistCommand.IIIl[0]]) ? 1 : 0)) {
            IIIlIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[1]]).append(BlacklistCommand.NO_PERM))));
            return BlacklistCommand.IIIl[0] != 0;
        }
        if (IlIll(IIIIIIlIlllllll.length, BlacklistCommand.IIIl[1])) {
            IIIlIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[2]]).append(BlacklistCommand.COMMAND_USAGE))));
            return BlacklistCommand.IIIl[0] != 0;
        }
        final StringBuilder IIlIIIlIlllllll = new StringBuilder();
        int llIlIIlIlllllll = BlacklistCommand.IIIl[1];
        while (IlIll(llIlIIlIlllllll, IIIIIIlIlllllll.length)) {
            IIlIIIlIlllllll.append(IIIIIIlIlllllll[llIlIIlIlllllll]).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[3]]);
            "".length();
            ++llIlIIlIlllllll;
            "".length();
            if (((0x52 ^ 0x37 ^ (0x9 ^ 0x32)) & (0xFC ^ 0xB8 ^ (0x55 ^ 0x4F) ^ -" ".length())) > "   ".length()) {
                return ((102 + 73 - 99 + 64 ^ 69 + 149 - 145 + 103) & (0xB8 ^ 0xA8 ^ (0x7B ^ 0x57) ^ -" ".length())) != 0x0;
            }
        }
        final String llIIIIlIlllllll = String.valueOf(IIlIIIlIlllllll);
        if (llIll(BlacklistCommand.ipValidity.matcher(IIIIIIlIlllllll[BlacklistCommand.IIIl[0]]).matches() ? 1 : 0)) {
            this.processIPBlacklist(IIIIIIlIlllllll[BlacklistCommand.IIIl[0]], IIIlIIlIlllllll, llIIIIlIlllllll);
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((81 + 77 + 29 + 39 ^ 128 + 132 - 128 + 38) & (0xFC ^ 0xB3 ^ (0xBE ^ 0xB9) ^ -" ".length())) != 0x0;
            }
        }
        else {
            final Player IlIlIIlIlllllll = Bukkit.getPlayer(IIIIIIlIlllllll[BlacklistCommand.IIIl[0]]);
            if (IIlll(IlIlIIlIlllllll)) {
                IIIlIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[4]]).append(BlacklistCommand.COMMAND_USAGE))));
            }
            this.processIPBlacklist(IlIlIIlIlllllll.getAddress().getAddress().getHostAddress(), IIIlIIlIlllllll, llIIIIlIlllllll);
        }
        return BlacklistCommand.IIIl[0] != 0;
    }
    
    private void processIPBlacklist(final String IIlIllIIlllllll, final CommandSender llIIllIIlllllll, final String llllIlIIlllllll) {
        BlacklistAPI.setBlacklist(IIlIllIIlllllll, llIIllIIlllllll.getName(), llllIlIIlllllll);
        long IlllIlIIlllllll = (long)Bukkit.getOnlinePlayers().iterator();
        while (llIll(((Iterator)IlllIlIIlllllll).hasNext() ? 1 : 0)) {
            final Player lllIllIIlllllll = ((Iterator<Player>)IlllIlIIlllllll).next();
            if (llIll(lllIllIIlllllll.getAddress().getAddress().getHostAddress().equals(IIlIllIIlllllll) ? 1 : 0)) {
                lllIllIIlllllll.kickPlayer(ChatUtil.fixColor(BlacklistCommand.PLAYER_KICK.replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[5]], llllIlIIlllllll)));
            }
            "".length();
            if (((0x83 ^ 0xA2 ^ (0x34 ^ 0x42)) & (0x5E ^ 0x61 ^ (0xC0 ^ 0xA8) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        llIIllIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[6]]).append(BlacklistCommand.ADMIN_BANNED_IP.replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[7]], IIlIllIIlllllll)))));
        IlllIlIIlllllll = (long)Bukkit.getOnlinePlayers().iterator();
        while (llIll(((Iterator)IlllIlIIlllllll).hasNext() ? 1 : 0)) {
            final Player IllIllIIlllllll = ((Iterator<Player>)IlllIlIIlllllll).next();
            if (llIll(IllIllIIlllllll.hasPermission(BlacklistCommand.Ill[BlacklistCommand.IIIl[8]]) ? 1 : 0)) {
                IllIllIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[9]]).append(BlacklistCommand.ADMINS_MESSAGE.replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[10]], llIIllIIlllllll.getName()).replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[11]], IIlIllIIlllllll)))));
            }
            "".length();
            if ("  ".length() <= ((0x55 ^ 0x63 ^ (0x10 ^ 0x30)) & (0xD7 ^ 0x82 ^ (0x34 ^ 0x77) ^ -" ".length()) & (((0x7 ^ 0x55 ^ "  ".length()) & (0x4C ^ 0x6D ^ (0x67 ^ 0x16) ^ -" ".length())) ^ -" ".length()))) {
                return;
            }
        }
        Bukkit.getConsoleSender().sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BlacklistCommand.PREFIX).append(BlacklistCommand.Ill[BlacklistCommand.IIIl[12]]).append(BlacklistCommand.ADMINS_MESSAGE.replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[13]], llIIllIIlllllll.getName()).replace(BlacklistCommand.Ill[BlacklistCommand.IIIl[14]], IIlIllIIlllllll)))));
    }
    
    private static boolean lIIll(final int lIIIllllIllllll) {
        return lIIIllllIllllll == 0;
    }
    
    private static String llIIl(final String llIlIIIIlllllll, final String IlIlIIIIlllllll) {
        try {
            final SecretKeySpec IIIIlIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIIIIlllllll.getBytes(StandardCharsets.UTF_8)), BlacklistCommand.IIIl[8]), "DES");
            final Cipher llllIIIIlllllll = Cipher.getInstance("DES");
            llllIIIIlllllll.init(BlacklistCommand.IIIl[2], IIIIlIIIlllllll);
            return new String(llllIIIIlllllll.doFinal(Base64.getDecoder().decode(llIlIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIIIIlllllll) {
            IlllIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIl(String lIlllIIIlllllll, final String IIlllIIIlllllll) {
        lIlllIIIlllllll = new String(Base64.getDecoder().decode(lIlllIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIlIIlllllll = new StringBuilder();
        final char[] lllllIIIlllllll = IIlllIIIlllllll.toCharArray();
        int IllllIIIlllllll = BlacklistCommand.IIIl[0];
        final byte IIIllIIIlllllll = (Object)lIlllIIIlllllll.toCharArray();
        final String lllIlIIIlllllll = (String)IIIllIIIlllllll.length;
        String IllIlIIIlllllll = (String)BlacklistCommand.IIIl[0];
        while (IlIll((int)IllIlIIIlllllll, (int)lllIlIIIlllllll)) {
            final char llIIIlIIlllllll = IIIllIIIlllllll[IllIlIIIlllllll];
            IIIIIlIIlllllll.append((char)(llIIIlIIlllllll ^ lllllIIIlllllll[IllllIIIlllllll % lllllIIIlllllll.length]));
            "".length();
            ++IllllIIIlllllll;
            ++IllIlIIIlllllll;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIIIIlIIlllllll);
    }
    
    private static boolean IlIll(final int IIIlllllIllllll, final int lllIllllIllllll) {
        return IIIlllllIllllll < lllIllllIllllll;
    }
    
    private static void IIIll() {
        (IIIl = new int[23])[0] = ((0x55 ^ 0x36 ^ (0x60 ^ 0x35)) & (0x10 ^ 0x5F ^ (0xFA ^ 0x83) ^ -" ".length()));
        BlacklistCommand.IIIl[1] = " ".length();
        BlacklistCommand.IIIl[2] = "  ".length();
        BlacklistCommand.IIIl[3] = "   ".length();
        BlacklistCommand.IIIl[4] = (0x9A ^ 0x9E);
        BlacklistCommand.IIIl[5] = (0x4A ^ 0x4F);
        BlacklistCommand.IIIl[6] = (0xA3 ^ 0xA5);
        BlacklistCommand.IIIl[7] = (5 + 71 - 16 + 76 ^ 28 + 59 - 19 + 75);
        BlacklistCommand.IIIl[8] = (0x25 ^ 0x78 ^ (0xC1 ^ 0x94));
        BlacklistCommand.IIIl[9] = (0x70 ^ 0x79);
        BlacklistCommand.IIIl[10] = (0x2B ^ 0x2D ^ (0x7C ^ 0x70));
        BlacklistCommand.IIIl[11] = (0x4B ^ 0x13 ^ (0xC ^ 0x5F));
        BlacklistCommand.IIIl[12] = (0xC8 ^ 0xA9 ^ (0x4D ^ 0x20));
        BlacklistCommand.IIIl[13] = (185 + 181 - 243 + 65 ^ 169 + 133 - 174 + 49);
        BlacklistCommand.IIIl[14] = (0x7D ^ 0x74 ^ (0x1D ^ 0x1A));
        BlacklistCommand.IIIl[15] = (0x98 ^ 0x97);
        BlacklistCommand.IIIl[16] = (0x55 ^ 0x2C ^ (0x79 ^ 0x10));
        BlacklistCommand.IIIl[17] = (0xAE ^ 0xBF);
        BlacklistCommand.IIIl[18] = (0x79 ^ 0x5E ^ (0x28 ^ 0x1D));
        BlacklistCommand.IIIl[19] = (0x53 ^ 0x40);
        BlacklistCommand.IIIl[20] = (0x5E ^ 0x45 ^ (0xB2 ^ 0xBD));
        BlacklistCommand.IIIl[21] = (0x66 ^ 0x73);
        BlacklistCommand.IIIl[22] = (0x78 ^ 0x6E);
    }
}
