package vote.california.registrationservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vote.california.registrationservice.services.VoterSummaryService

@RestController
@RequestMapping("/voter")
class VoterController(val service: VoterSummaryService) {

    @GetMapping("/create/{id}")
    fun register(
        @PathVariable id: String
    ) = service.recordAddedUser(id)

    @GetMapping("/update/{id}")
    fun update(
        @PathVariable id: String
    ) = service.recordUpdatedUser(id)

    @GetMapping("/remove/{id}")
    fun delete(
        @PathVariable id: String
    ) = service.recordRemovedUser(id)
}