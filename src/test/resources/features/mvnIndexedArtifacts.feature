Feature: MVN Repository Indexed Artifact

     #UserStory: SUP-93

  Scenario:Verifying the result for indexed Artifacts
    Given user is on mvnrepository application
    When User clicks on Indexed Artifacts menu on the left
    Then User should see header "Top 20 repositories"
    And It should be listed "20" repositories result

