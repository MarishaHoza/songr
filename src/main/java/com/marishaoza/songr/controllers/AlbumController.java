package com.marishaoza.songr.controllers;


import com.marishaoza.songr.models.Album;
import com.marishaoza.songr.models.AlbumRepository;
import com.marishaoza.songr.models.Song;
import com.marishaoza.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URL;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title,
                                 String artist,
                                 @RequestParam(required = false, defaultValue = "0") int songCount,
                                 @RequestParam(required = false, defaultValue = "0") int lengthInMinutes,
                                 URL imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, lengthInMinutes * 60, imageUrl);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }

    @DeleteMapping("/albums")
    public RedirectView deleteAlbum(long id) {
        Album albumToDelete = albumRepository.findById(id).get();
        List<Song> relatedSongs = songRepository.findByAlbum(albumToDelete);
        songRepository.deleteAll(relatedSongs);
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @GetMapping("/album/{id}")
    public String getOneAlbum(@PathVariable long id, Model m) {
        Album searchedAlbum = albumRepository.findById(id).get();
        m.addAttribute("album", searchedAlbum);
        return "oneAlbum";
    }

}
