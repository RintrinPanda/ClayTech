package club.claycoffee.ClayTech;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import club.claycoffee.ClayTech.utils.Utils;
import me.mrCookieSlime.Slimefun.Lists.Categories;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;

public class Defines {
	public static final ItemStack[] NORECIPE = { null, null, null, null, null, null, null, null, null };

	// ����
	public static final LockedCategory C_BASICS = new LockedCategory(new NamespacedKey(ClayTech.plugin, "claycategory"),
			Utils.newItemD(Material.CLAY, "��bճ���Ƽ� - ����"), Categories.MACHINES_1);
	public static final LockedCategory C_WEAPONS = new LockedCategory(
			new NamespacedKey(ClayTech.plugin, "claycategory"), Utils.newItemD(Material.DIAMOND_SWORD, "��bճ���Ƽ� - ����"),
			C_BASICS);
	public static final LockedCategory C_FOOD = new LockedCategory(new NamespacedKey(ClayTech.plugin, "claycategory"),
			Utils.newItemD(Material.ENCHANTED_GOLDEN_APPLE, "��bճ���Ƽ� - ʳ��"), C_BASICS);
	public static final LockedCategory C_FOODMATERIALS = new LockedCategory(
			new NamespacedKey(ClayTech.plugin, "claycategory"), Utils.newItemD(Material.COCOA_BEANS, "��bճ���Ƽ� - ʳ�����ϲ���"),
			C_BASICS);
	public static final LockedCategory C_DRINK = new LockedCategory(new NamespacedKey(ClayTech.plugin, "claycategory"),
			Utils.newItemD(Material.WATER_BUCKET, "��bճ���Ƽ� - ����"), C_BASICS);
	public static final LockedCategory C_MATERIALS = new LockedCategory(
			new NamespacedKey(ClayTech.plugin, "claycategory"), Utils.newItemD(Material.COAL, "��bճ���Ƽ� - ����"), C_BASICS);
	public static final LockedCategory C_ARMORS = new LockedCategory(new NamespacedKey(ClayTech.plugin, "claycategory"),
			Utils.newItemD(Material.DIAMOND_CHESTPLATE, "��bճ���Ƽ� - װ��"), C_BASICS);
	public static final LockedCategory C_DECORATES = new LockedCategory(
			new NamespacedKey(ClayTech.plugin, "claycategory"), Utils.newItemD(Material.PLAYER_HEAD, "��bճ���Ƽ� - װ��Ʒ"),
			C_BASICS);

	// ע��
	public static final ItemStack MAGIC_CLAY = Utils.addLore(Utils.newItemD(Material.CLAY_BALL, "��6ħ����ճ��"),
			"��bճ���Ƽ��Ļ�����Ʒ,���ճ���Ƽ��ĺϳɶ���Ҫ���");
	public static final ItemStack CLAY_STICK = Utils.addLore(Utils.newItemD(Material.STICK, "��6������ľ��"),
			"��b�������������ղص�ľ��,������ĳЩ����");
	public static final ItemStack ARTIFICIAL_GOLD_NUGGET = Utils.newItemD(Material.GOLD_NUGGET, "��6�������");
	public static final ItemStack ARTIFICIAL_GOLD_INGOT_O = Utils.newItemD(Material.COAL, "��6�����ԭ��");
	public static final ItemStack ARTIFICIAL_GOLD_INGOT = Utils.newItemD(Material.GOLD_INGOT, "��6�����");
	public static final ItemStack ARTIFICIAL_GOLD_BLOCK = Utils.newItemD(Material.GOLD_BLOCK, "��6������");
	public static final ItemStack ARTIFICIAL_ENCHANTED_GOLDEN_APPLE = Utils.newItemD(Material.ENCHANTED_GOLDEN_APPLE,
			"��5��l���츽ħ��ƻ��");
	public static final ItemStack BLIND_CORE = Utils.newItemD(Material.COAL, "��7ʧ������");
	public static final ItemStack BLIND_SWORD = Utils.addLore(
			Utils.addLore(Utils.newItemD(Material.DIAMOND_SWORD, "��7ʧ����"), "��6�ڹ�������豻�������5���ӵ�ʧ��VЧ��"), "��7ʧ�� V");
	public static final ItemStack CONFUSION_CORE = Utils.newItemD(Material.WITHER_SKELETON_SKULL, "��7��θ����");
	public static final ItemStack BLACK_ROCK_BLOCK = Utils.newItemD(Material.OBSIDIAN, "��7���ҿ�");
	public static final ItemStack SLOWNESS_CORE = Utils.newItemD(Material.OBSIDIAN, "��7��������");
	public static final ItemStack POISON_EYE = Utils.newItemD(Material.SPIDER_EYE, "��7�綾֮��");
	public static final ItemStack POISON_CORE = Utils.newItemD(Material.SPIDER_EYE, "��7�綾����");
	public static final ItemStack ADVANCED_BLIND_CORE = Utils.newItemD(Material.COAL, "��7�߼�ʧ������");
	public static final ItemStack ADVANCED_CONFUSION_CORE = Utils.newItemD(Material.WITHER_SKELETON_SKULL, "��7�߼���θ����");
	public static final ItemStack ADVANCED_SLOWNESS_CORE = Utils.newItemD(Material.OBSIDIAN, "��7�߼���������");
	public static final ItemStack ADVANCED_POISON_CORE = Utils.newItemD(Material.SPIDER_EYE, "��7�߼��綾����");
	public static final ItemStack FOUR_BOW = Utils.setLoreList(Utils.newItemD(Material.BOW, "��7�����ĺϹ�"),
			new String[] { "��6�ڹ�������豻�������5���ӵ�ʧ��V������V����θV��2���ӵ��ж�IIIЧ��", "��7ʧ�� V", "��7���� V", "��7��θ V", "��7�ж� III" });
	public static final ItemStack POISON_SWORD = Utils.setLoreList(Utils.newItemD(Material.DIAMOND_SWORD, "��7������"),
			new String[] { "��6�ڹ�������豻�������2���ӵ��ж�IIIЧ��", "��7�ж� III" });
	public static final ItemStack ANTI_SLOWNESS_BOOTS = Utils.setLoreList(Utils.newItemD(Material.IRON_BOOTS, "��7������ѥ"),
			new String[] { "��6���˴�����û���3Ч��2��", "��7�������� III" });
	public static final ItemStack COCOA_BEAN = Utils.setLoreList(Utils.newItemD(Material.COCOA_BEANS, "��e�ɿɶ�"),
			new String[] { "��6Yay!��ζ�Ŀɿɶ�!", "��7�������������Ⱥ��ɿ�����" });
	public static final ItemStack PLASTIC = Utils.setLoreList(Utils.newItemD(Material.WHITE_DYE, "��e����"),
			new String[] { "��6��������,�������ⶪ��", "��7��������������ƿ" });
	public static final ItemStack RAW_CHICKEN_FOOT = Utils.setLoreList(Utils.newItemD(Material.RABBIT_FOOT, "��e����"),
			new String[] { "��6����", "��7����ʳ�ã����ұ��¯�￾����ʳ�á�" });
	public static final ItemStack CHICKEN_FOOT = Utils.setLoreList(Utils.newItemD(Material.RABBIT_FOOT, "��eը����"),
			new String[] { "��6ը����", "��7ʳ�ú�����8�㱥ʳ��." });
	public static final ItemStack RAW_BREAD = Utils.setLoreList(Utils.newItemD(Material.BREAD, "��e�����"),
			new String[] { "��6�����", "��7ʳ�ú�����6�㱥ʳ��." });
	public static final ItemStack DIRTY_TEA = Utils.setLoreList(Utils.newItemD(Material.KELP, "��e���Ҷ"),
			new String[] { "��6���Ҷ", "��7�Ҽ�����ϴ,��ɲ�Ҷ!", "��7����м��ʻ��" });
	public static final ItemStack RAW_TEA = Utils.setLoreList(Utils.newItemD(Material.KELP, "��e��Ҷ"),
			new String[] { "��6��Ҷ", "��7����������Ҷ��", "��7���Ҷ��ϴ���" });
	public static final ItemStack TEA_POWDER = Utils.setLoreList(Utils.newItemD(Material.BROWN_DYE, "��e��Ҷ��"),
			new String[] { "��6��Ҷ��", "��7����������" });
	public static final ItemStack LEMON_POWDER = Utils.setLoreList(Utils.newItemD(Material.YELLOW_DYE, "��e���ʷ�"),
			new String[] { "��6���ʷ�", "��7������������֭" });
	public static final ItemStack FLOUR = Utils.setLoreList(Utils.newItemD(Material.SUGAR, "��e���"),
			new String[] { "��6���", "��7�����������öණ��", "��7�ջ�С���м��ʻ��" });
	public static final ItemStack STARCH = Utils.setLoreList(Utils.newItemD(Material.SUGAR, "��e���"),
			new String[] { "��6���", "��7�����������öණ��", "��7�ջ��������м��ʻ��" });
	public static final ItemStack SNAIL_HEALTHY = Utils.setLoreList(Utils.newItemD(Material.NAUTILUS_SHELL, "��e����"),
			new String[] { "��6����", "��7�������������Ϸ�", "��7�����м��ʻ��" });
	public static final ItemStack SNAIL_BAD = Utils.setLoreList(Utils.newItemD(Material.NAUTILUS_SHELL, "��e������"),
			new String[] { "��6������", "��7��һ������?", "��7�����м��ʻ��" });
	public static final ItemStack HONEY_SWEET = Utils.setLoreList(Utils.newItemD(Material.HONEYCOMB, "��e������"),
			new String[] { "��6������", "��7�������̫���ˢ�..", "��7ʳ�ú�����8�㱥ʳ��." });

	// ͷ­
	public static final ItemStack CLAYCOFFEE_HEAD = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/58c55ba01ccc7e79b5495e5c4e00080ff6c92a832b2905fed724f2f68a3bb94c"),
			"��6������ͷ"), new String[] { "��b������ͷ,����ȥ�Ӱ�!" });
	public static final ItemStack STALIN_HEAD = Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/96fb8390f61a2cc51c08201834369829d9ba301effc01b6a7cb10d830c6c5043"),
			"��b˹���ֵ�ͷ");
	public static final ItemStack MARX_HEAD = Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/57304952eff15a9fb81fa070fa549f85243c790f8fa61bf6e196a7516ce85a48"),
			"��b���˼��ͷ");
	public static final ItemStack LANTERN_C = Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/7cc217a9b9e3ce3cd0484c7e8ce49d1cf741281bdda5a4d6cb821f378752718"),
			"��b����");
	public static final ItemStack CLOCK_C = Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/ba10da526e5111cfb6e3ebd47693e162dd52d41a2182028daa7c2b19aa3143"),
			"��b��ɫʱ��");
	public static final ItemStack CLAY_COFFEE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/411511bdd55bcb82803c8039f1c155fd43062636e23d4d46c4d761c04d22c2"),
			"��eճ������"), new String[] { "��6ճ������!", "��7ʳ�ú������5�㱥ʳ�Ⱥ�3����ҹ��Ч��", "��e���ɷ���" });;
	public static final ItemStack DRINK_BOTTLE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/9179ce4849723434e84747ec85fbbfb1121456c8aeb2e9171fb8328921d45"),
			"��e����ƿ"), new String[] { "��6����ƿ", "��7�������ϵıر���Ʒ", "��7û��ƿ����ôװ������?����װ��?", "��e���ɷ���" });
	public static final ItemStack DIRTY_DRINK_BOTTLE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/9179ce4849723434e84747ec85fbbfb1121456c8aeb2e9171fb8328921d45"),
			"��e������ƿ"), new String[] { "��6������ƿ", "��7�������ƿ��Ҫ��ϴ���ϴϴ..", "��7�ĸ�С�к����������ƿ��?�Ҽ�������ϴ��!(��Ҫһ��ˮͰ)", "��e���ɷ���" });
	public static final ItemStack SPICY_CHICKEN_BURGER = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/c5e27988a6538010efc0e24756bc3e3eea24d7536b20932c17e0404e5cc55f"),
			"��e�������ȱ�"), new String[] { "��6�������ȱ�", "��7ʳ�ú�����15��ʳ�Ⱥ�20������IIЧ��", "��7���ѵ��ڳ�ϮCFC?", "��e���ɷ���" });
	public static final ItemStack BABA_BURGER = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/c5e27988a6538010efc0e24756bc3e3eea24d7536b20932c17e0404e5cc55f"),
			"��e�ϰ�����С����"), new String[] { "��6�ϰ�����С����", "��7�Ը�����?(��ɵ��κκ������������)", "��e���ɷ���" });
	public static final ItemStack RAW_VEGETABLE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/477dd842c975d8fb03b1add66db8377a18ba987052161f22591e6a4ede7f5"),
			"��e����"), new String[] { "��6����", "��7ʳ�ú�����1�㱥ʳ��", "��e���ɷ���" });
	public static final ItemStack LEMON = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/957fd56ca15978779324df519354b6639a8d9bc1192c7c3de925a329baef6c"),
			"��e����"), new String[] { "��6����", "��7ʳ�ú�����1�㱥ʳ�Ⱥ�10�뷴θIVЧ��", "��7��������", "��7�ƻ���Ҷ�м��ʻ��", "��e���ɷ���" });

	public static final ItemStack LEMON_POWDER_DRINK = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/d8e94ddd769a5bea748376b4ec7383fd36d267894d7c3bee011e8e4f5fcd7"),
			"��e����֭"), new String[] { "��6����֭", "��7ʳ�ú�����6�㱥ʳ�Ⱥ�10�뷴θIVЧ��", "��7��������", "��e���ɷ���" });
	public static final ItemStack TEA_DRINK = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/d8e94ddd769a5bea748376b4ec7383fd36d267894d7c3bee011e8e4f5fcd7"),
			"��e��"), new String[] { "��6��", "��7ʳ�ú�����6�㱥ʳ�Ⱥ�30�뿹������IIIЧ��", "��e���ɷ���" });
	public static final ItemStack LEMON_TEA_DRINK = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/d8e94ddd769a5bea748376b4ec7383fd36d267894d7c3bee011e8e4f5fcd7"),
			"��e���ʲ�"), new String[] { "��6���ʲ�", "��7ʳ�ú�����12�㱥ʳ�Ⱥ�60�뿹������IIIЧ��", "��7�ⶫ����һ����ܾ��Ǳ������..", "��e���ɷ���" });
	public static final ItemStack CHOCOLATE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/819f948d17718adace5dd6e050c586229653fef645d7113ab94d17b639cc466"),
			"��e�ɿ���"), new String[] { "��6�ɿ���", "��7ʳ�ú�����15�㱥ʳ�Ⱥ�30�뿹������IIIЧ��", "��7����!����������!��ɨ����,���غ���~", "��e���ɷ���" });
	public static final ItemStack SNAIL_FOOD = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/26834b5b25426de63538ec82ca8fbecfcbb3e682d8063643d2e67a7621bd"),
			"��e���Ϸ�"), new String[] { "��6���Ϸ�", "��7ʳ�ú�����12�㱥ʳ�Ⱥ�30�뿹������IIIЧ��", "��7�ó���..����ͦ�óԵ�.", "��e���ɷ���" });

	// ����
	public static final ItemStack CLAY_CRAFTING_TABLE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/6d6c65b44c34b1acc2ccb346752397125f0d9ffa0ab3c50a99d1db3b74c63"),
			"��eճ���ں���"),
			new String[] { "", "��f�ܹ�����ĳЩճ���Ƽ���Ʒ", "",
					LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE).replaceAll("&", "��"),
					LoreBuilder.powerBuffer(128).replaceAll("&", "��"), "��8\u21E8 ��e\u26A1 ��716 J/s" });
	public static final ItemStack CLAY_FOOD_CAULDRON = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/dfd9b2f42d5f1c2a77b511fe41a4c6b5c192fb10b2ceadde05bd1af52a151"),
			"��e���"),
			new String[] { "", "��f�ܹ�����ճ���Ƽ��е�ʳ��", "",
					LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE).replaceAll("&", "��"),
					LoreBuilder.powerBuffer(512).replaceAll("&", "��"), "��8\u21E8 ��e\u26A1 ��732 J/s" });
	public static final ItemStack CLAY_FOOD_CHALKING_MACHINE = Utils.setLoreList(Utils.setDisplayName(SkullItem.fromURL(
			"http://textures.minecraft.net/texture/98636123b1a3755abd8aef6d85b2a85bf10f486edefdd1a3cef7679d825"),
			"��eʳ���ۻ�"),
			new String[] { "", "��f�ܹ�����ճ���Ƽ��е�ĳЩ��ĩ", "",
					LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE).replaceAll("&", "��"),
					LoreBuilder.powerBuffer(512).replaceAll("&", "��"), "��8\u21E8 ��e\u26A1 ��732 J/s" });
}
