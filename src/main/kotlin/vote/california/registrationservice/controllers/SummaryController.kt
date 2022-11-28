package vote.california.registrationservice.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vote.california.registrationservice.data.Summary
import vote.california.registrationservice.services.VoterSummaryService

@RestController
@RequestMapping("/summary")
class SummaryController(val service: VoterSummaryService) {

    @GetMapping("/created")
    fun getCreated(): ResponseEntity<Summary> {
        return ResponseEntity.ok(service.summarizeTotalUserAdds())
    }

    @GetMapping("/updated")
    fun getUpdated(): ResponseEntity<Summary> {
        return ResponseEntity.ok(service.summarizeTotalUserUpdates())
    }

    @GetMapping("/deleted")
    fun getRemoved(): ResponseEntity<Summary> {
        return ResponseEntity.ok(service.summarizeTotalUserRemoves())
    }
}