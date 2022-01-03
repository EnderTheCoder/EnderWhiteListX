package com.ender;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Commander implements CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (args.length == 0) {
            // 参数数量太少，拒绝处理
            return false;
        }
        try {
            String content = Files.readString(Path.of("whitelist.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject whiteList = JSON.parser;
        UUID uuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + command).getBytes());

        return true;
    }
}