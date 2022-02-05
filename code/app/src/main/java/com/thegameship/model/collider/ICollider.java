package com.thegameship.model.collider;

import java.util.UUID;

public interface ICollider {
    ColliderInfo isCollision(double nextX, double nextY, double height, double width, UUID id, double heightWindow, double widthWindow);
}