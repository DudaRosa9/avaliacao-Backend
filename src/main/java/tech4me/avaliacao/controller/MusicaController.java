package br.com.tech4me.avaliacao.view.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private final MusicaService musicaService;

    @Autowired
    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping
    public ResponseEntity<List<MusicaDto>> findAll() {
        List<MusicaDto> musicas = musicaService.findAll();
        return new ResponseEntity<>(musicas, HttpStatus.OK);
    }
}
