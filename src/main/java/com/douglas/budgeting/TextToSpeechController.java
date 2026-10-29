package com.douglas.budgeting;


import java.nio.charset.StandardCharsets;

import org.springframework.ai.audio.tts.TextToSpeechModel;
import org.springframework.ai.chat.client.ResponseEntity;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
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

  /*   @PostMapping(value = "/synthesize", produces = "audio/mp3")
    public ResponseEntity<Resource>(@RequestBody SynthesizeRequest request){
       byte [] audio = textToSpeechService.call(request.text());
       var resource = new ByteArrayResource(audio);

       return ResponseEntity.ok()
               .header(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment()
               .filename("audio.mp3")
               .build()
               .toString()).body(resource);
               
    }

    record SynthesizeRequest(String text) {

    }*/
}
