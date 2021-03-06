package org.nathantehbeast.scripts.braceletCrafter;

import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;

/**
 * Created with IntelliJ IDEA.
 * User: Nathan
 * Date: 5/26/13
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public final class Constants {
    public static final int GOLD_ID = 2357;
    public static final int BRACELET_ID = 11069;
    public static final int FURNACE_ID = 26814;

    public static final Area BANK_AREA = new Area(new Tile(3089, 3501, 0), new Tile(3089, 3487, 0), new Tile(3101, 3487, 0),
            new Tile(3101, 3501, 0));
    public static final Area FURNACE_AREA = new Area(new Tile(3104, 3503, 0), new Tile(3104, 3496, 0), new Tile(3111, 3496, 0),
            new Tile(3111, 3503, 0));
}
