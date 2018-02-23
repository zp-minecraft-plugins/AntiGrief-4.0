package us.greenzack.antigrief.objects;

public enum AlertType {
	//TODO: Implement a custom item setup somehow
	//Enum Format (Name(AdminMessage, UserMessage, Permission, itemid, datavalue)
	
	//Spawn Eggs
	//Hostile Mob Spawn Eggs
	EGG_BLAZE("$player$ tried to spawn a Blaze egg $amount$ times!", "You can't spawn a Blaze here!", "egg.blaze", 383, 61),
	EGG_CAVESPIDER("$player$ tried to spawn a Cave Spider egg $amount$ times!", "You can't spawn a Cave Spider here!", "egg.cavespider", 383, 59),
	EGG_CREEPER("$player$ tried to spawn a Creeper egg $amount$ times!", "You can't spawn a Creeper here!", "egg.creeper", 383, 50),
	EGG_ENDERMAN("$player$ tried to spawn an Enderman $amount$ times!", "You can't spawn an Enderman here!", "egg.enderman", 383, 58),
	EGG_GHAST("$player$ tried to spawn a Ghast $amount$ times!", "You can't spawn a Ghast here!", "egg.ghast", 383, 56),
	EGG_MAGMACUBE("$player$ tried to spawn a Magma Cube $amount$ times!", "You can't spawn a Magma Cube here!", "egg.magmacube", 383, 62),
	EGG_SILVERFISH("$player$ tried to spawn a Silverfish $amount$ times!", "You can't spawn a Silverfish here!", "egg.silverfish", 383, 60),
	EGG_SKELETON("$player$ tried to spawn a Skelton $amount$ times!", "You can't spawn a Skeleton here!", "egg.skeleton", 383, 51),
	EGG_SLIME("$player$ tried to spawn a Slime $amount$ times!", "You can't spawn a Slime here!", "egg.slime", 383, 55),
	EGG_SPIDER("$player$ tried to spawn a Spider $amount$ times!", "You can't spawn a Spider here!", "egg.spider", 383, 52),
	EGG_ZOMBIE("$player$ tried to spawn a Zombie $amount$ times!", "You can't spawn a Zombie here!", "egg.zombie", 383, 54),
	EGG_ZOMBIEPIGMAN("$player$ tried to spawn a Zombie Pigman $amount$ times!", "You can't spawn a Zombie Pigman here!", "egg.zombiepigman", 383, 57),
	
	//Animal Spawn Eggs
	EGG_BAT("$player$ tried to spawn a Bat $amount$ times!", "You can't spawn a Bat here!", "egg.bat", 383, 65),
	EGG_CHICKEN("$player$ tried to spawn a Chicken $amount$ times!", "You can't spawn a Chicken here!", "egg.chicken", 383, 93),
	EGG_COW("$player$ tried to spawn a Cow $amount$ times!", "You can't spawn a Cow here!", "egg.cow", 383, 92),
	EGG_MOOSHROOM("$player$ tried to spawn a Mooshroom $amount$ times!", "You can't spawn a Mooshroom here!", "egg.mooshroom", 383, 96),
	EGG_OCELOT("$player$ tried to spawn an Ocelot $amount$ times!", "You can't spawn an Ocelot $amount$ times!", "egg.ocelot", 383, 98),
	EGG_PIG("$player$ tried to spawn a Pig $amount$ times!", "You can't spawn a Pig here!", "egg.pig", 383, 90),
	EGG_SHEEP("$player$ tried to spawn a Sheep $amount$ times!", "You can't spawn a Sheep here!", "egg.sheep", 383, 91),
	EGG_SQUID("$player$ tried to spawn a Squid $amount$ times!", "You can't spawn a Squid here!", "egg.squid", 383, 94),
	EGG_WOLF("$player$ tried to spawn a Wolf $amount$ times!", "You can't spawn a Wolf here!", "egg.wolf", 383, 95),
	
	//NPC Spawn Eggs
	EGG_VILLAGER("$player tried to spawn a Villager $amount$ times!", "You can't spawn a Villager here!", "egg.villager", 383, 120),
	EGG_WITCH("$player tried to spawn a Witch $amount$ times!", "You can't spawn a Witch here!", "egg.witch", 383, 66),
	
	//Block Placing
	BLOCK_DISPENSER("$player$ tried to place a Dispenser $amount$ times!", "You can't placae a Dispenser here!", "place.dispenser", 23, 0),
	BLOCK_STICKYPISTON("$player$ tried to place a Sticky Piston $amount$ times!", "You can't place a Sticky Piston here!", "place.stickypiston", 29, 0),
	BLOCK_PISTON("$player$ tried to place a Piston $amount$ times!", "You can't place a Piston here!", "place.piston", 33, 0),
	BLOCK_TNT("$player$ tried to place TnT $amount$ times!", "You can't place TnT here!", "place.tnt", 46, 0),
	BLOCK_SPAWNER("$player$ tried to place a Mob Spawner $amount$ times!", "You can't place a Mob Spawner here!", "place.mobspawner", 52, 0),
	BLOCK_ICE("$player$ tried to place Ice $amount$ times!", "You can't place Ice here!", "place.ice", 79, 0),
	BLOCK_PORTAL("$player$ tried to place a Portal Block $amount$ times!", "You can't place a Portal Block here!", "place.portalblock", 90, 0),
	BLOCK_ENDERCHEST("$player$ tried to place an Ender Chest $amount$ times!", "You can't place an Ender Chest here!", "place.enderchest", 130, 0),
	BLOCK_COMMANDBLOCK("$player$ tried to place a Command Block $amount$ times!", "You can't place a Command Block here!", "place.commandblock", 137, 0),
	BLOCK_BEACON("$player$ tried to place a Beacon $amount times!", "You can't place a Beacon here!", "place.beacon", 138, 0),
	BLOCK_SIGN("$player$ tried to place a Sign $amount$ times!", "You can't place a Sign here!", "place.sign", 323, 0),
	
	//Liquids
	LIQUID_WATER("$player$ tried to place Water $amount$ times!", "You can't place Water here!", "liquid.water", null, null),
	LIQUID_LAVA("$player$ tried to place Lava $amount$ times!", "You can't place Lava here!", "liquid.lava", null, null),
	
	
	;
	
	private String adminMessage;
	private String userMessage;
	private String permission;
	private Integer itemId;
	private Integer datavalue;
	//ADD: Find the Object type for data values!
	
	private AlertType(String amsg, String umsg, String perm, Integer id, Integer data){
	
		this.adminMessage = amsg;
		this.userMessage = umsg;
		this.permission = perm;
		this.itemId = id;
		this.datavalue = data;
	}

	public String getAdminMessage(){
	
		return this.adminMessage;
	}
	
	public String getUserMessage(){
		
		return this.userMessage;
	}
	
	public String getPermission(){
		
		return this.permission;
	}
	
	public Integer getItemId(){
		
		return this.itemId;
	}
	
	public Integer getDataValue(){
		
		return this.datavalue;
	}
}