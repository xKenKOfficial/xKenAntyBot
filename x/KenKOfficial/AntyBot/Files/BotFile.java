package x.KenKOfficial.AntyBot.Files;

import java.io.IOException;
import org.bukkit.Bukkit;
import java.util.Arrays;
import org.bukkit.configuration.file.YamlConfiguration;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;
import org.bukkit.plugin.Plugin;

public class BotFile
{
    public static /* synthetic */ File rfile;
    static /* synthetic */ BotFile instance;
    private static final /* synthetic */ int[] IlIl;
    /* synthetic */ FileConfiguration data;
    private static final /* synthetic */ String[] lIIl;
    
    private static void lIIIIl() {
        (IlIl = new int[6])[0] = ((0x54 ^ 0x77 ^ (0x7 ^ 0xB)) & (115 + 134 - 197 + 96 ^ 84 + 45 + 24 + 34 ^ -" ".length()));
        BotFile.IlIl[1] = " ".length();
        BotFile.IlIl[2] = "  ".length();
        BotFile.IlIl[3] = "   ".length();
        BotFile.IlIl[4] = (0x13 ^ 0x33 ^ (0x52 ^ 0x76));
        BotFile.IlIl[5] = (119 + 76 - 153 + 118 ^ 78 + 164 - 96 + 22);
    }
    
    private static void IIIIIl() {
        (lIIl = new String[BotFile.IlIl[4]])[BotFile.IlIl[0]] = lIlll("lVZZWRFLC2kvmDilgGgsFg==", "SovtM");
        BotFile.lIIl[BotFile.IlIl[1]] = Illll("KRgVCwkrB1oLATU=", "Yttrl");
        BotFile.lIIl[BotFile.IlIl[2]] = Illll("HxgpYiA+CyIjbSsQICMpPgYtIW0hHSUpOHEBICM0NAM/bDQ8HQ==", "QqLBM");
        BotFile.lIIl[BotFile.IlIl[3]] = lllll("HaBYzvjAPGpMQI19a6L9tDU6VnU3LrmQxkTYupHXe3pxtXeM75IGMg==", "umdKK");
    }
    
    private static boolean llIIIl(final int lIIIIlIlIllllll, final int IIIIIlIlIllllll) {
        return lIIIIlIlIllllll < IIIIIlIlIllllll;
    }
    
    private static String lIlll(final String lIIIIIllIllllll, final String IIIIIIllIllllll) {
        try {
            final SecretKeySpec IIlIIIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIIIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIIIllIllllll = Cipher.getInstance("Blowfish");
            llIIIIllIllllll.init(BotFile.IlIl[2], IIlIIIllIllllll);
            return new String(llIIIIllIllllll.doFinal(Base64.getDecoder().decode(lIIIIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIIllIllllll) {
            IlIIIIllIllllll.printStackTrace();
            return null;
        }
    }
    
    public void reloadData() {
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(BotFile.rfile);
    }
    
    private static String lllll(final String IIllIIllIllllll, final String lIllIIllIllllll) {
        try {
            final SecretKeySpec lIIIlIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIllIllllll.getBytes(StandardCharsets.UTF_8)), BotFile.IlIl[5]), "DES");
            final Cipher IIIIlIllIllllll = Cipher.getInstance("DES");
            IIIIlIllIllllll.init(BotFile.IlIl[2], lIIIlIllIllllll);
            return new String(IIIIlIllIllllll.doFinal(Base64.getDecoder().decode(IIllIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIllIllllll) {
            llllIIllIllllll.printStackTrace();
            return null;
        }
    }
    
    public static BotFile getInstance() {
        return BotFile.instance;
    }
    
    public void setup(final Plugin IIlIIlllIllllll) {
        if (IlIIIl(IIlIIlllIllllll.getDataFolder().exists() ? 1 : 0)) {
            IIlIIlllIllllll.getDataFolder().mkdir();
            "".length();
        }
        final File IllIIlllIllllll = new File(String.valueOf(new StringBuilder().append(IIlIIlllIllllll.getDataFolder()).append(File.separator).append(BotFile.lIIl[BotFile.IlIl[0]])));
        BotFile.rfile = new File(IllIIlllIllllll, String.valueOf(String.valueOf(new StringBuilder().append(String.valueOf(File.separatorChar)).append(BotFile.lIIl[BotFile.IlIl[1]]))));
        if (IlIIIl(BotFile.rfile.exists() ? 1 : 0)) {
            try {
                IllIIlllIllllll.mkdirs();
                "".length();
                BotFile.rfile.createNewFile();
                "".length();
                "".length();
                if ((0x83 ^ 0x86) == 0x0) {
                    return;
                }
            }
            catch (IOException lIIlIlllIllllll) {
                Bukkit.getServer().getLogger().severe(BotFile.lIIl[BotFile.IlIl[2]]);
            }
        }
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(BotFile.rfile);
    }
    
    private static String Illll(String lIIIllIlIllllll, final String llIlIlIlIllllll) {
        lIIIllIlIllllll = new String(Base64.getDecoder().decode(lIIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllIlIlIllllll = new StringBuilder();
        final char[] IlllIlIlIllllll = llIlIlIlIllllll.toCharArray();
        int lIllIlIlIllllll = BotFile.IlIl[0];
        final double lllIIlIlIllllll = (Object)lIIIllIlIllllll.toCharArray();
        final short IllIIlIlIllllll = (short)lllIIlIlIllllll.length;
        char lIlIIlIlIllllll = (char)BotFile.IlIl[0];
        while (llIIIl(lIlIIlIlIllllll, IllIIlIlIllllll)) {
            final char IlIIllIlIllllll = lllIIlIlIllllll[lIlIIlIlIllllll];
            llllIlIlIllllll.append((char)(IlIIllIlIllllll ^ IlllIlIlIllllll[lIllIlIlIllllll % IlllIlIlIllllll.length]));
            "".length();
            ++lIllIlIlIllllll;
            ++lIlIIlIlIllllll;
            "".length();
            if ((0x81 ^ 0x85) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllIlIlIllllll);
    }
    
    static {
        lIIIIl();
        IIIIIl();
        BotFile.instance = new BotFile();
    }
    
    public FileConfiguration getFile() {
        return this.data;
    }
    
    private static boolean IlIIIl(final int IllllIIlIllllll) {
        return IllllIIlIllllll == 0;
    }
    
    public void saveData() {
        try {
            this.data.save(BotFile.rfile);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        catch (IOException IIlllIllIllllll) {
            Bukkit.getServer().getLogger().severe(BotFile.lIIl[BotFile.IlIl[3]]);
        }
    }
}
