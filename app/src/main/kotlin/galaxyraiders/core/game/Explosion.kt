package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
) :
  SpaceObject("Explosion", 'X', initialPosition, Vector2D(0.0, 0.0), 1.0, 0.0) {
  var age: Int = 0

  fun tick() {
    this.age++
  }
}
