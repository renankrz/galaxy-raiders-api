package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@DisplayName("Given an explosion")
class ExplosionTest {
  private val explosion = Explosion(
    initialPosition = Point2D(1.0, 1.0),
  )

  @Test
  fun `it has a type Explosion`() {
    assertEquals("Explosion", explosion.type)
  }

  @Test
  fun `it has a symbol X`() {
    assertEquals('X', explosion.symbol)
  }

  @Test
  fun `it shows the type Explosion when converted to String`() {
    assertTrue(explosion.toString().contains("Explosion"))
  }

  @Test
  fun `it starts with age zero`() {
    assertEquals(explosion.age, 0)
  }

  @Test
  fun `it has its age updated when a tick happens`() {
    explosion.tick()
    assertEquals(explosion.age, 1)
  }
}
