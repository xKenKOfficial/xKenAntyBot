package x.KenKOfficial.AntyBot.Basic;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import x.KenKOfficial.AntyBot.Files.BlacklistFile;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import x.KenKOfficial.AntyBot.Apis.BotCheckerAPI;
import x.KenKOfficial.AntyBot.Commands.UnBlacklistCommand;
import org.bukkit.command.CommandExecutor;
import x.KenKOfficial.AntyBot.Commands.BlacklistCommand;
import java.io.PrintStream;
import x.KenKOfficial.AntyBot.Listeners.PlayerJoin;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import x.KenKOfficial.AntyBot.Listeners.AsyncPlayerPreLogin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ String[] lllIl;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ int[] IIIll;
    
    private static boolean lIIIlIl(final int IlllIlllIIlllll) {
        return IlllIlllIIlllll != 0;
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[17]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new AsyncPlayerPreLogin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        this.saveFiles();
        System.out.println(Main.lllIl[Main.IIIll[7]]);
        System.out.println(this.getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[8]]).append(this.getDescription().getVersion())));
        System.out.println(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[9]]).append(Bukkit.getBukkitVersion())));
        final PrintStream out = System.out;
        String s;
        if (lIIIlIl(this.isEnabled() ? 1 : 0)) {
            s = Main.lllIl[Main.IIIll[10]];
            "".length();
            if (" ".length() >= (0x58 ^ 0x5C)) {
                return;
            }
        }
        else {
            s = Main.lllIl[Main.IIIll[11]];
        }
        out.println(s);
        System.out.println(Main.lllIl[Main.IIIll[12]]);
        System.out.println(Main.lllIl[Main.IIIll[13]]);
    }
    
    private void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[14]]).append(this.getName())));
        this.getCommand(Main.lllIl[Main.IIIll[15]]).setExecutor((CommandExecutor)new BlacklistCommand());
        this.getCommand(Main.lllIl[Main.IIIll[16]]).setExecutor((CommandExecutor)new UnBlacklistCommand());
    }
    
    private void saveFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[19]]).append(this.getName())));
        BotCheckerAPI.getDataFolder().saveData();
    }
    
    static {
        IIIIlIl();
        llllIIl();
    }
    
    private static void IIIIlIl() {
        (IIIll = new int[21])[0] = ((15 + 129 - 75 + 71 ^ 125 + 62 - 68 + 49) & (0x9 ^ 0x14 ^ (0x6D ^ 0x54) ^ -" ".length()));
        Main.IIIll[1] = " ".length();
        Main.IIIll[2] = "  ".length();
        Main.IIIll[3] = "   ".length();
        Main.IIIll[4] = (0xB2 ^ 0x97 ^ (0x27 ^ 0x6));
        Main.IIIll[5] = (0xBF ^ 0xC7 ^ (0xC3 ^ 0xBE));
        Main.IIIll[6] = (132 + 14 - 11 + 0 ^ 40 + 119 - 58 + 28);
        Main.IIIll[7] = (0x39 ^ 0x2F ^ (0xA8 ^ 0xB9));
        Main.IIIll[8] = (0x8D ^ 0x85);
        Main.IIIll[9] = (0x96 ^ 0x9F);
        Main.IIIll[10] = (0xA6 ^ 0x95 ^ (0x30 ^ 0x9));
        Main.IIIll[11] = (0xC9 ^ 0xAA ^ (0x36 ^ 0x5E));
        Main.IIIll[12] = (0x3B ^ 0x37);
        Main.IIIll[13] = (0xD ^ 0x30 ^ (0x2C ^ 0x1C));
        Main.IIIll[14] = (0x27 ^ 0x29);
        Main.IIIll[15] = (0x58 ^ 0x25 ^ (0x7F ^ 0xD));
        Main.IIIll[16] = (0xA8 ^ 0xB8);
        Main.IIIll[17] = (0xA3 ^ 0xB2);
        Main.IIIll[18] = (92 + 121 - 180 + 114 ^ 80 + 79 - 56 + 26);
        Main.IIIll[19] = (0x74 ^ 0x67);
        Main.IIIll[20] = (0xA5 ^ 0xB1);
    }
    
    private static void llllIIl() {
        (lllIl = new String[Main.IIIll[20]])[Main.IIIll[0]] = IIllIIl("bEpCQkRsSkJCRGxKQkJEbEpCQkRsSkJCRGxKQkJEbEpCQkRsSkJCRGxKQkJEbEpCQkRsSkJCRGxKQkI=", "Oiaag");
        Main.lllIl[Main.IIIll[1]] = IIllIIl("OA8GIQUOUFQ=", "ojtRo");
        Main.lllIl[Main.IIIll[2]] = lIllIIl("YPYlw6zrTma9gVdS5MEMbA==", "BoJkl");
        Main.lllIl[Main.IIIll[3]] = IIllIIl("CAU9MT8mGSgmMQ==", "InIHH");
        Main.lllIl[Main.IIIll[4]] = IIllIIl("PQcNMR0NGwA/ARgMDg==", "ybwPv");
        Main.lllIl[Main.IIIll[5]] = lIllIIl("lneUA54/VZRarm5VprbXFIu2Tf5hXpPjHGgXY8MQVP/zeOLla+s9CuxxNPiF0egsWoludGbdoMhOl0wWiP0BYQ==", "ZeGFa");
        Main.lllIl[Main.IIIll[6]] = IlllIIl("xXrXFSNeyr/FetcVI17Kv8V61xUjXsq/xXrXFSNeyr/FetcVI17Kv8V61xUjXsq/xXrXFSNeyr9AetbDTP3M6w==", "KjVmu");
        Main.lllIl[Main.IIIll[7]] = IlllIIl("EnkA/2jiKtESeQD/aOIq0RJ5AP9o4irREnkA/2jiKtESeQD/aOIq0RJ5AP9o4irREnkA/2jiKtF9WDHK2wJa4w==", "ZkdeA");
        Main.lllIl[Main.IIIll[8]] = IIllIIl("PD0XMiEKYkU=", "kXeAK");
        Main.lllIl[Main.IIIll[9]] = IlllIIl("UsjONBYa4nseRd5An+4kjw==", "onWXK");
        Main.lllIl[Main.IIIll[10]] = IIllIIl("BBIDPQAqDhYqDg==", "EywDw");
        Main.lllIl[Main.IIIll[11]] = IlllIIl("j6A9hvhv6c+gfZwC8FBP+w==", "vhDrP");
        Main.lllIl[Main.IIIll[12]] = lIllIIl("6ba3tg8Fo3wAuUBAfupYPJb0CydIK1h5xKIzYnfd1hurel5qTydiGvWCrH8ntxFLajAHLFgqcVc/7TbSehsjXQ==", "XDNrv");
        Main.lllIl[Main.IIIll[13]] = IIllIIl("d1ZNWXt3Vk1Ze3dWTVl7d1ZNWXt3Vk1Ze3dWTVl7d1ZNWXt3Vk1Ze3dWTVl7d1ZNWXt3Vk1Ze3dWTVk=", "TunzX");
        Main.lllIl[Main.IIIll[14]] = lIllIIl("KDNw7WvjXNVOuggkDwMyEYZXCnEQO2KqXGzbj2R0JJ4=", "yGOYA");
        Main.lllIl[Main.IIIll[15]] = IlllIIl("4NRvUDEqO5ou4tAIbaH3kw==", "MTTlN");
        Main.lllIl[Main.IIIll[16]] = lIllIIl("wE8g9Y78Ds8EaXG6FfJUlg==", "aLsmx");
        Main.lllIl[Main.IIIll[17]] = IIllIIl("OwgLBCYWBwYOcRIfCgUlGB5PEXEHBRoMOBkcVUs=", "wiokQ");
        Main.lllIl[Main.IIIll[18]] = IIllIIl("HwAhAzUyDywJYiMNLActJEEuAyw1CCIZMDICPAYsKgItTDhzESkZJToPMFZi", "SaElB");
        Main.lllIl[Main.IIIll[19]] = IlllIIl("JbwYaCYtNc2SvA+lCExYHpI1sxdFW5JlLsPuKqMAra5cbJ2X5yWRjDnXMHvamdOW", "BNSZe");
    }
    
    private static String IIllIIl(String lIIlIIIIlIlllll, final String IIIlIIIIlIlllll) {
        lIIlIIIIlIlllll = (int)new String(Base64.getDecoder().decode(((String)lIIlIIIIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIIIIlIlllll = new StringBuilder();
        final char[] llIlIIIIlIlllll = IIIlIIIIlIlllll.toCharArray();
        int IlIlIIIIlIlllll = Main.IIIll[0];
        final String IIlIIIIIlIlllll = (Object)((String)lIIlIIIIlIlllll).toCharArray();
        final short llIIIIIIlIlllll = (short)IIlIIIIIlIlllll.length;
        byte IlIIIIIIlIlllll = (byte)Main.IIIll[0];
        while (IlIIlIl(IlIIIIIIlIlllll, llIIIIIIlIlllll)) {
            final char llllIIIIlIlllll = IIlIIIIIlIlllll[IlIIIIIIlIlllll];
            IIllIIIIlIlllll.append((char)(llllIIIIlIlllll ^ llIlIIIIlIlllll[IlIlIIIIlIlllll % llIlIIIIlIlllll.length]));
            "".length();
            ++IlIlIIIIlIlllll;
            ++IlIIIIIIlIlllll;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIllIIIIlIlllll);
    }
    
    private static boolean IlIIlIl(final int lIIIllllIIlllll, final int IIIIllllIIlllll) {
        return lIIIllllIIlllll < IIIIllllIIlllll;
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.lllIl[Main.IIIll[0]]);
        System.out.println(this.getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[1]]).append(this.getDescription().getVersion())));
        System.out.println(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[2]]).append(Bukkit.getBukkitVersion())));
        final PrintStream out = System.out;
        String s;
        if (lIIIlIl(this.isEnabled() ? 1 : 0)) {
            s = Main.lllIl[Main.IIIll[3]];
            "".length();
            if ((0x9F ^ 0x9B) <= ((0x4F ^ 0x69) & ~(0xE6 ^ 0xC0))) {
                return;
            }
        }
        else {
            s = Main.lllIl[Main.IIIll[4]];
        }
        out.println(s);
        System.out.println(Main.lllIl[Main.IIIll[5]]);
        System.out.println(Main.lllIl[Main.IIIll[6]]);
    }
    
    private void registerFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lllIl[Main.IIIll[18]]).append(this.getName())));
        BlacklistFile.getDataFolder().load();
        BotCheckerAPI.getDataFolder().setup((Plugin)this);
    }
    
    private static String lIllIIl(final String lllIllllIIlllll, final String IllIllllIIlllll) {
        try {
            final SecretKeySpec IIllllllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIllllIIlllll.getBytes(StandardCharsets.UTF_8)), Main.IIIll[8]), "DES");
            final Cipher llIlllllIIlllll = Cipher.getInstance("DES");
            llIlllllIIlllll.init(Main.IIIll[2], IIllllllIIlllll);
            return new String(llIlllllIIlllll.doFinal(Base64.getDecoder().decode(lllIllllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlllllIIlllll) {
            IlIlllllIIlllll.printStackTrace();
            return null;
        }
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static String IlllIIl(final String IIlllIIIlIlllll, final String lIlllIIIlIlllll) {
        try {
            final SecretKeySpec lIIIIlIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIIlIIlIlllll = Cipher.getInstance("Blowfish");
            IIIIIlIIlIlllll.init(Main.IIIll[2], lIIIIlIIlIlllll);
            return new String(IIIIIlIIlIlllll.doFinal(Base64.getDecoder().decode(IIlllIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIlIlllll) {
            lllllIIIlIlllll.printStackTrace();
            return null;
        }
    }
}
