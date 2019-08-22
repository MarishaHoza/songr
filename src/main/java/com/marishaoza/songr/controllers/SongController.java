package com.marishaoza.songr.controllers;

import com.marishaoza.songr.models.Album;
import com.marishaoza.songr.models.AlbumRepository;
import com.marishaoza.songr.models.Song;
import com.marishaoza.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @PostMapping("/songs")
    public RedirectView addSong(String title, int lengthInSeconds, int trackNumber, long albumId) {
        Album linkedAlbum = albumRepository.findById(albumId).get();
        Song newSong = new Song(title, lengthInSeconds, trackNumber, linkedAlbum);

        String redirectBack = String.format("/album/%d", albumId);

        songRepository.save(newSong);
        return new RedirectView(redirectBack);
    }

    @DeleteMapping("/songs")
    public RedirectView deleteAlbum(long songId, long albumId) {
        songRepository.deleteById(songId);

        String redirectBack = String.format("/album/%d", albumId);

        return new RedirectView(redirectBack);
    }
}
