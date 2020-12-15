package club.sk1er.mods.core.universal.utils

//#if FABRIC
//$$ typealias MCMinecraft = net.minecraft.client.MinecraftClient
//$$ typealias MCWorld = net.minecraft.client.world.ClientWorld
//$$ typealias MCFontRenderer = net.minecraft.client.font.TextRenderer
//$$ typealias MCScreen = net.minecraft.client.gui.screen.Screen
//$$ typealias MCChatScreen = net.minecraft.client.gui.screen.ChatScreen
//$$ typealias MCEntityPlayerSP = net.minecraft.client.network.ClientPlayerEntity
//$$ typealias MCClientNetworkHandler = net.minecraft.client.network.ClientPlayNetworkHandler
//#else
typealias MCMinecraft = net.minecraft.client.Minecraft
typealias MCFontRenderer = net.minecraft.client.gui.FontRenderer

//#if MC>=11502
//$$ typealias MCWorld = net.minecraft.client.world.ClientWorld
//$$ typealias MCEntityPlayerSP = net.minecraft.client.entity.player.ClientPlayerEntity
//$$ typealias MCChatScreen = net.minecraft.client.gui.NewChatGui
//$$ typealias MCScreen = net.minecraft.client.gui.AbstractGui
//$$ typealias MCClientNetworkHandler = net.minecraft.client.network.play.ClientPlayNetHandler
//#else
typealias MCWorld = net.minecraft.client.multiplayer.WorldClient
typealias MCEntityPlayerSP = net.minecraft.client.entity.EntityPlayerSP
typealias MCScreen = net.minecraft.client.gui.GuiScreen
typealias MCChatScreen = net.minecraft.client.gui.GuiNewChat
typealias MCClientNetworkHandler = net.minecraft.client.network.NetHandlerPlayClient
//#endif

//#endif