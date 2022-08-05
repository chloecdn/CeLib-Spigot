package de.celinadev.celibspigot.network;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import de.celinadev.celibspigot.CeLib;
import org.bukkit.entity.Player;

import java.util.UUID;

public class ServerClientNetworking {

    public static void sendDataToClient(String subchannel, Player player, Object... data) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        for (Object o : data) {
            if (o instanceof String o1) {
                out.writeUTF(o1);
            } else if (o instanceof Integer o1) {
                out.writeInt(o1);
            } else if (o instanceof Boolean o1) {
                out.writeBoolean(o1);
            } else if (o instanceof Byte o1) {
                out.writeByte(o1);
            } else if (o instanceof Character o1) {
                out.writeChar(o1);
            } else if (o instanceof Double o1) {
                out.writeDouble(o1);
            } else if (o instanceof Float o1) {
                out.writeFloat(o1);
            } else if (o instanceof Long o1) {
                out.writeLong(o1);
            } else if (o instanceof Short o1) {
                out.writeLong(o1);
            } else if (o instanceof UUID o1) {
                out.writeLong(o1.getLeastSignificantBits());
                out.writeLong(o1.getMostSignificantBits());
            } else throw new IllegalArgumentException("Unsupported data type(s) included.");
        }
        player.sendPluginMessage(CeLib.getPlugin(), subchannel, out.toByteArray());
    }
}
