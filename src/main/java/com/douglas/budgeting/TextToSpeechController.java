
package com.douglas.budgeting;

import org.springframework.ai.audio.tts.TextToSpeechModel;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TextToSpeechController {

    private final TextToSpeechModel textToSpeechService;

    public TextToSpeechController(TextToSpeechModel textToSpeechService) {
        this.textToSpeechService = textToSpeechService;
    }

    @PostMapping(value = "/synthesize", produces = "audio/mpeg")
    public ResponseEntity<Resource> synthesize(
            @RequestBody SynthesizeRequest request) {

        byte[] audio = textToSpeechService.call(request.text());

        var resource = new ByteArrayResource(audio);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("audio/mpeg"))
                .header(
                        HttpHeaders.CONTENT_DISPOSITION,
                        ContentDisposition.attachment()
                                .filename("audio.mp3")
                                .build()
                                .toString()
                )
                .body(resource);
    }

    public record SynthesizeRequest(String text) {
    }
}
