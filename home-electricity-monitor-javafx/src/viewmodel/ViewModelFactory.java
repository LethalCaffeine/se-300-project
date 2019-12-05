package viewmodel;

import model.ModelFactory;

public class ViewModelFactory {

	private ApplianceViewModel applianceViewModel;
	private HomePageViewModel homePageViewModel;
	private SchedulerViewModel schedulerViewModel;
	private MappingViewModel mappingViewModel;
	private SimulationViewModel simulationViewModel;
	
	public ViewModelFactory(ModelFactory mf) {
		homePageViewModel = new HomePageViewModel(mf.getApplicanceModel());
		applianceViewModel = new ApplianceViewModel(mf.getApplicanceModel());
		schedulerViewModel = new SchedulerViewModel(mf.getApplicanceModel());
		mappingViewModel = new MappingViewModel(mf.getApplicanceModel());
		simulationViewModel = new SimulationViewModel(mf.getApplicanceModel());
	}

	public HomePageViewModel getHomePageViewModel() {
		return homePageViewModel;
	}
	
	public void setHomePageViewModel(HomePageViewModel homePageViewModel) {
		this.homePageViewModel = homePageViewModel;
	}
	
	public ApplianceViewModel getApplianceViewModel() {
		return applianceViewModel;
	}

	public void setApplianceViewModel(ApplianceViewModel applianceViewModel) {
		this.applianceViewModel = applianceViewModel;
	}

	public SchedulerViewModel getSchedulerViewModel() {
		return schedulerViewModel;
	}

	public void setSchedulerViewModel(SchedulerViewModel loginViewModel) {
		this.schedulerViewModel = loginViewModel;
	}

	public MappingViewModel getMappingViewModel() {
		return mappingViewModel;
	}

	public void setMappingViewModel(MappingViewModel mappingViewModel) {
		this.mappingViewModel = mappingViewModel;
	}

	public SimulationViewModel getSimulationViewModel() {
		return simulationViewModel;
	}

	public void setSimulationViewModel(SimulationViewModel simulationViewModel) {
		this.simulationViewModel = simulationViewModel;
	}
	
}
