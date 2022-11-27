package vote.california.registrationservice.services

import org.springframework.stereotype.Component
import vote.california.registrationservice.data.Summary
import vote.california.registrationservice.data.VoterAdded
import vote.california.registrationservice.data.VoterDelete
import vote.california.registrationservice.data.VoterUpdate
import vote.california.registrationservice.repositories.VoterAddedRepository
import vote.california.registrationservice.repositories.VoterDeletedRepository
import vote.california.registrationservice.repositories.VoterUpdatedRepository

@Component
class VoterServiceImpl(
    val voterAddedRepository: VoterAddedRepository,
    val voterDeletedRepository: VoterDeletedRepository,
    val voterUpdatedRepository: VoterUpdatedRepository,
) : VoterSummaryService {
    override fun recordAddedUser(userId: String) {
        this.voterAddedRepository.save(
            VoterAdded(userId)
        )
    }

    override fun recordRemovedUser(userId: String) {
        this.voterDeletedRepository.save(
            VoterDelete(userId)
        )
    }

    override fun recordUpdatedUser(userId: String) {
        this.voterUpdatedRepository.save(
            VoterUpdate(userId)
        )
    }

    override fun summarizeTotalUserAdds() = Summary(voterAddedRepository.count().toInt())

    override fun summarizeTotalUserRemoves() = Summary(voterDeletedRepository.count().toInt())

    override fun summarizeTotalUserUpdates() = Summary(voterUpdatedRepository.count().toInt())

}
