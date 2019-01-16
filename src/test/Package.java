package test;

/**
 * @author I068499
 *
 */
public class Package {

	private String id;
	private String version;
	private String scope;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope
	 *            the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "id=" + id + ",version=" + version + ",scope=" + scope;
	}

	public static void fromJSONObject(Package pkg) {
		try {
			
			pkg = new Package();
			pkg.setId("Name");
			pkg.setScope("Scope");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
