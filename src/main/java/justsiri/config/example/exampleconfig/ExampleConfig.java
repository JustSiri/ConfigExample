package justsiri.config.example.exampleconfig;

import justsiri.config.example.exampleconfig.file.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleConfig extends JavaPlugin {

    @Override
    public void onEnable() {

        //구성 파일을 설정합니다.
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Config.setup();
        Config.get().options().copyDefaults(true);
        Config.save();
    }

}
