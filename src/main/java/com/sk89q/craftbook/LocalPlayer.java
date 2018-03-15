// $Id$
/*
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not,
 * see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.craftbook;

import com.sk89q.craftbook.util.ItemInfo;
import com.sk89q.craftbook.util.exceptions.InsufficientPermissionsException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.util.Location;

import java.util.UUID;

/**
 * Holds an abstraction for players.
 *
 */
public interface LocalPlayer {

    void print(String message);

    void printError(String message);

    void printRaw(String message);

    void checkPermission(String perm) throws InsufficientPermissionsException;

    boolean hasPermission(String perm);

    String getName();

    UUID getUniqueId();

    String getCraftBookId();

    Location getPosition();

    void setPosition(Vector pos, float pitch, float yaw);

    void teleport(Location location);

    boolean isSneaking();

    void setSneaking(boolean state);

    boolean isInsideVehicle();

    @Deprecated
    int getHeldItemType();

    @Deprecated
    short getHeldItemData();

    ItemInfo getHeldItemInfo();

    boolean isHoldingBlock();

    String translate(String message);
}
