package justsiri.config.example.exampleconfig.file;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    private static File file;
    private static FileConfiguration customFile;

    //커스텀 구성 파일을 찾거나, 만듭니다.
    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("ExampleConfig").getDataFolder(), "CustomConfig.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                //?
            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get() {
        return customFile;
    }

    public static void save() {
        try {
            customFile.save(file);
        } catch (IOException e) {
            System.out.println("파일을 저장할 수 없습니다");
        }
    }

    public static void reload() {
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}
