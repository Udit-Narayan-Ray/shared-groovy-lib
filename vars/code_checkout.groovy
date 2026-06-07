def call(String git_repo_url, String branch_name){
  git url: "${git_repo_url}", branch: "${branch_name}"
}
