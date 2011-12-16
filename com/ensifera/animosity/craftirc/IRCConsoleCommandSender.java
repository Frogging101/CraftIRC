/**
 * 
 */
package com.ensifera.animosity.craftirc;

import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
/**
 * @author Animosity
 *
 */
public class IRCConsoleCommandSender implements ConsoleCommandSender {
    private Boolean op = false;
    private RelayedMessage ircConCmd = null;
    
 
    /**
     * 
     * @param server  - Server
     * @param ircConCmdMsg - RelayedMessage
     * @param isOp - Boolean
     */
    public IRCConsoleCommandSender(Server server, RelayedMessage ircConCmd, Boolean isOp) {
        super();
        this.ircConCmd = ircConCmd;
        this.op = isOp;
    }
    
    public boolean isOp() { return this.op; }
    
    public boolean isPlayer() { return false; }
    
    public void sendMessage(String message) {
        try {
            ircConCmd.getPlugin().sendMessageToTag(">> " + message, ircConCmd.srcChannelTag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionAttachment addAttachment(Plugin arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasPermission(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasPermission(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPermissionSet(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPermissionSet(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void recalculatePermissions() {
		// TODO Auto-generated method stub
		
	}

	public void removeAttachment(PermissionAttachment arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setOp(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
}
