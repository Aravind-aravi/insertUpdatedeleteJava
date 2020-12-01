package insertUpdateDelete;

public class LoginGS {

	private String AdminName;
	private String AdminPassword;
	private String AgentName;
	private String AgentPassword;

	public LoginGS(String adminName, String adminPassword, String agentName, String agentPassword) {
		super();
		AdminName = adminName;
		AdminPassword = adminPassword;
		AgentName = agentName;
		AgentPassword = agentPassword;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public String getAgentPassword() {
		return AgentPassword;
	}
	public void setAgentPassword(String agentPassword) {
		AgentPassword = agentPassword;
	}

}
