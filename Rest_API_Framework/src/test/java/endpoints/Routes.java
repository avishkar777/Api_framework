package endpoints;

public class Routes {

    public static String base_uri= "https://neo-mrapi.recruitcrm.io/";
    public static String getAllCandidate_url=base_uri+"v1/candidates";
    public static String searchCandidate_url=base_uri+"v1/candidates/search";
    public static String searchCandidateBySlug=base_uri+"v1/candidates/{Candidate_slug}";
    public static String allHiringStages=base_uri+"v1/candidates/{CandidateSlug_id}/hiring-stages";

    public static String candidateHiringStagesJob=base_uri+"/v1/candidates/{Candidate_slug}/hiring-stages/{Job_slug}";

    public static String reqUpdatedProfile=base_uri+"v1/candidates/{Candidate_slug}/request-update";

    public static String createCandidate=base_uri+"/v1/candidates";

    public static String EditCandidate=base_uri+"v1/candidates/{Candidate_slug}";

    public static String assignCandidateToJob=base_uri+"v1/candidates/{Candidate_slug}/assign?job_slug={Job_slug}";

    public static String applyToJob=base_uri+"v1/candidates/{Candidate_slug}/apply";

    public static String unAssignCandidateToJob=base_uri+"v1/candidates/{Candidate_slug}/unassign";

    public static String updateCandidateHiringStage=base_uri+"v1/candidates/{Candidate_slug}/hiring-stages/{Job_slug}";

    public static String updateCandidateVisibilty= base_uri+"/v1/candidates/{Candidate_slug}/visibility/{Job_slug}";
}
