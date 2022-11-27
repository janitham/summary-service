package vote.california.registrationservice.services

import vote.california.registrationservice.data.Summary

interface VoterSummaryService {
    fun recordAddedUser(userId: String)
    fun recordRemovedUser(userId: String)
    fun recordUpdatedUser(userId: String)
    fun summarizeTotalUserAdds(): Summary
    fun summarizeTotalUserRemoves(): Summary
    fun summarizeTotalUserUpdates(): Summary

}