package kumoh_3_2.controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf("Golder", "Blue Valentine", "타입캡슐")
    @GetMapping("/songs")

    fun getSongList(): List<String> {
        return title
    }

}