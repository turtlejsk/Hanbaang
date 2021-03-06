package hanbaang;

import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import Action.*;

public class Configuration implements ServletContextListener {
	public static HashMap<String, Action> actions = new HashMap<>();
	Action action;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		setUpPage();
	}

	public void setUpPage() {
		// ACCOUNT TABLE ACTION
		action = new AccountAction("/ACCOUNT/DELETE_ACCOUNT_BY_PK.jsp", 1);
		actions.put("/DELETE_ACCOUNT_BY_PK.hb", action);
		action = new AccountAction("/ACCOUNT/INSERT_ACCOUNT.jsp", 2);
		actions.put("/INSERT_ACCOUNT.hb", action);
		action = new AccountAction("/ACCOUNT/SELECT_ACCOUNT_BY_PK.jsp", 3);
		actions.put("/SELECT_ACCOUNT_BY_PK.hb", action);
		action = new AccountAction("/ACCOUNT/SELECT_ACCOUNT.jsp", 4);
		actions.put("/SELECT_ACCOUNT.hb", action);
		action = new AccountAction("/ACCOUNT/UPDATE_ACCOUNT_BY_PK.jsp", 5);
		actions.put("/UPDATE_ACCOUNT_BY_PK.hb", action);
		action = new AccountAction("/ACCOUNT/LOGIN_ACCOUNT.jsp", 6);
		actions.put("/LOGIN_ACCOUNT.hb", action);
		action = new AccountAction("/ACCOUNT/LOGOUT_ACCOUNT.jsp", 7);
		actions.put("/LOGOUT_ACCOUNT.hb", action);
		action = new AccountAction("/ACCOUNT/LOGIN_TEST.jsp", 8);
		actions.put("/LOGIN_TEST.hb", action);

		// DRUG TABLE ACTION
		action = new DrugAction("/DRUG/DELETE_DRUG_BY_PK.jsp", 1);
		actions.put("/DELETE_DRUG_BY_PK.hb", action);
		action = new DrugAction("/DRUG/INSERT_DRUG.jsp", 2);
		actions.put("/INSERT_DRUG.hb", action);
		action = new DrugAction("/DRUG/SELECT_DRUG_BY_PK.jsp", 3);
		actions.put("/SELECT_DRUG_BY_PK.hb", action);
		action = new DrugAction("/DRUG/SELECT_DRUG.jsp", 4);
		actions.put("/SELECT_DRUG.hb", action);
		action = new DrugAction("/DRUG/UPDATE_DRUG_BY_PK.jsp", 5);
		actions.put("/UPDATE_DRUG_BY_PK.hb", action);
		action = new DrugAction("/DRUG/SELECT_DRUG.jsp", 6);
		actions.put("/SELECT_DRUG_BY_FK_PR.hb", action);

		// FREQ PRESC ACTION
		action = new FreqPrescAction("/FREQ_PRESC/DELETE_FREQ_PRESC_BY_PK.jsp", 1);
		actions.put("/DELETE_FREQ_PRESC_BY_PK.hb", action);
		action = new FreqPrescAction("/FREQ_PRESC/INSERT_FREQ_PRESC.jsp", 2);
		actions.put("/INSERT_FREQ_PRESC.hb", action);
		action = new FreqPrescAction("/FREQ_PRESC/SELECT_FREQ_PRESC_BY_PK.jsp", 3);
		actions.put("/SELECT_FREQ_PRESC_BY_PK.hb", action);
		action = new FreqPrescAction("/FREQ_PRESC/SELECT_FREQ_PRESC.jsp", 4);
		actions.put("/SELECT_FREQ_PRESC.hb", action);
		action = new FreqPrescAction("/FREQ_PRESC/UPDATE_FREQ_PRESC_BY_PK.jsp", 5);
		actions.put("/UPDATE_FREQ_PRESC_BY_PK.hb", action);

		// INSUR TABLE ACTION
		action = new InsurAction("/INSUR/DELETE_INSUR_BY_PK.jsp", 1);
		actions.put("/DELETE_INSUR_BY_PK.hb", action);
		action = new InsurAction("/INSUR/INSERT_INSUR.jsp", 2);
		actions.put("/INSERT_INSUR.hb", action);
		action = new InsurAction("/INSUR/SELECT_INSUR_BY_PK.jsp", 3);
		actions.put("/SELECT_INSUR_BY_PK.hb", action);
		action = new InsurAction("/INSUR/SELECT_INSUR.jsp", 4);
		actions.put("/SELECT_INSUR.hb", action);
		action = new InsurAction("/INSUR/UPDATE_INSUR_BY_PK.jsp", 5);
		actions.put("/UPDATE_INSUR_BY_PK.hb", action);

		// INSUR DETAIL TABLE ACTION
		action = new InsurDetailAction("/INSUR_DETAIL/DELETE_INSUR_DETAIL_BY_PK.jsp", 1);
		actions.put("/DELETE_INSUR_DETAIL_BY_PK.hb", action);
		action = new InsurDetailAction("/INSUR_DETAIL/INSERT_INSUR_DETAIL.jsp", 2);
		actions.put("/INSERT_INSUR_DETAIL.hb", action);
		action = new InsurDetailAction("/INSUR_DETAIL/SELECT_INSUR_DETAIL_BY_PK.jsp", 3);
		actions.put("/SELECT_INSUR_DETAIL_BY_PK.hb", action);
		action = new InsurDetailAction("/INSUR_DETAIL/SELECT_INSUR_DETAIL.jsp", 4);
		actions.put("/SELECT_INSUR_DETAIL.hb", action);
		action = new InsurDetailAction("/INSUR_DETAIL/UPDATE_INSUR_DETAIL_BY_PK.jsp", 5);
		actions.put("/UPDATE_INSUR_DETAIL_BY_PK.hb", action);

		// PATNT TABLE ACTION
		action = new PatntAction("/PATNT/DELETE_PATNT_BY_PK.jsp", 1);
		actions.put("/DELETE_PATNT_BY_PK.hb", action);
		action = new PatntAction("/PATNT/INSERT_PATNT.jsp", 2);
		actions.put("/INSERT_PATNT.hb", action);
		action = new PatntAction("/PATNT/SELECT_PATNT_BY_PK.jsp", 3);
		actions.put("/SELECT_PATNT_BY_PK.hb", action);
		action = new PatntAction("/PATNT/SELECT_PATNT.jsp", 4);
		actions.put("/SELECT_PATNT.hb", action);
		action = new PatntAction("/PATNT/UPDATE_PATNT_BY_PK.jsp", 5);
		actions.put("/UPDATE_PATNT_BY_PK.hb", action);

		// PHYSIC TABLE ACTION
		action = new PhysicAction("/PHYSIC/DELETE_PHYSIC_BY_PK.jsp", 1);
		actions.put("/DELETE_PHYSIC_BY_PK.hb", action);
		action = new PhysicAction("/PHYSIC/INSERT_PHYSIC.jsp", 2);
		actions.put("/INSERT_PHYSIC.hb", action);
		action = new PhysicAction("/PHYSIC/SELECT_PHYSIC_BY_PK.jsp", 3);
		actions.put("/SELECT_PHYSIC_BY_PK.hb", action);
		action = new PhysicAction("/PHYSIC/SELECT_PHYSIC.jsp", 4);
		actions.put("/SELECT_PHYSIC.hb", action);
		action = new PhysicAction("/PHYSIC/UPDATE_PHYSIC_BY_PK.jsp", 5);
		actions.put("/UPDATE_PHYSIC_BY_PK.hb", action);

		// PRESC TABLE ACTION
		action = new PrescAction("/PRESC/DELETE_PRESC_BY_PK.jsp", 1);
		actions.put("/DELETE_PRESC_BY_PK.hb", action);
		action = new PrescAction("/PRESC/INSERT_PRESC.jsp", 2);
		actions.put("/INSERT_PRESC.hb", action);
		action = new PrescAction("/PRESC/SELECT_PRESC_BY_PK.jsp", 3);
		actions.put("/SELECT_PRESC_BY_PK.hb", action);
		action = new PrescAction("/PRESC/SELECT_PRESC.jsp", 4);
		actions.put("/SELECT_PRESC.hb", action);
		action = new PrescAction("/PRESC/UPDATE_PRESC_BY_PK.jsp", 5);
		actions.put("/UPDATE_PRESC_BY_PK.hb", action);

		// RECEP TABLE ACTION
		action = new RecepAction("/RECEP/DELETE_RECEP_BY_PK.jsp", 1);
		actions.put("/DELETE_RECEP_BY_PK.hb", action);
		action = new RecepAction("/RECEP/INSERT_RECEP.jsp", 2);
		actions.put("/INSERT_RECEP.hb", action);
		action = new RecepAction("/RECEP/SELECT_RECEP_BY_PK.jsp", 3);
		actions.put("/SELECT_RECEP_BY_PK.hb", action);
		action = new RecepAction("/RECEP/SELECT_RECEP.jsp", 4);
		actions.put("/SELECT_RECEP.hb", action);
		action = new RecepAction("/RECEP/UPDATE_RECEP_BY_PK.jsp", 5);
		actions.put("/UPDATE_RECEP_BY_PK.hb", action);

		// SUB ACCOUNT TABLE ACTION
		action = new SubAccAction("/SUB_ACCOUNT/DELETE_SUB_ACCOUNT_BY_PK.jsp", 1);
		actions.put("/DELETE_SUB_ACCOUNT_BY_PK.hb", action);
		action = new SubAccAction("/SUB_ACCOUNT/INSERT_SUB_ACCOUNT.jsp", 2);
		actions.put("/INSERT_SUB_ACCOUNT.hb", action);
		action = new SubAccAction("/SUB_ACCOUNT/SELECT_SUB_ACCOUNT_BY_PK.jsp", 3);
		actions.put("/SELECT_SUB_ACCOUNT_BY_PK.hb", action);
		action = new SubAccAction("/SUB_ACCOUNT/SELECT_SUB_ACCOUNT.jsp", 4);
		actions.put("/SELECT_SUB_ACCOUNT.hb", action);
		action = new SubAccAction("/SUB_ACCOUNT/UPDATE_SUB_ACCOUNT_BY_PK.jsp", 5);
		actions.put("/UPDATE_SUB_ACCOUNT_BY_PK.hb", action);

		// TREAT TABLE ACTION
		action = new TreatAction("/TREAT/DELETE_TREAT_BY_PK.jsp", 1);
		actions.put("/DELETE_TREAT_BY_PK.hb", action);
		action = new TreatAction("/TREAT/INSERT_TREAT.jsp", 2);
		actions.put("/INSERT_TREAT.hb", action);
		action = new TreatAction("/TREAT/SELECT_TREAT_BY_PK.jsp", 3);
		actions.put("/SELECT_TREAT_BY_PK.hb", action);
		action = new TreatAction("/TREAT/SELECT_TREAT.jsp", 4);
		actions.put("/SELECT_TREAT.hb", action);
		action = new TreatAction("/TREAT/UPDATE_TREAT_BY_PK.jsp", 5);
		actions.put("/UPDATE_TREAT_BY_PK.hb", action);

		// CHIM TABLE ACTION
		action = new ChimAction("/CHIM/DELETE_CHIM_BY_PK.jsp", 1);
		actions.put("/DELETE_CHIM_BY_PK.hb", action);
		action = new ChimAction("/CHIM/INSERT_CHIM.jsp", 2);
		actions.put("/INSERT_CHIM.hb", action);
		action = new ChimAction("/CHIM/SELECT_CHIM_BY_PK.jsp", 3);
		actions.put("/SELECT_CHIM_BY_PK.hb", action);
		action = new ChimAction("/CHIM/SELECT_CHIM.jsp", 4);
		actions.put("/SELECT_CHIM.hb", action);
		action = new ChimAction("/CHIM/UPDATE_CHIM_BY_PK.jsp", 5);
		actions.put("/UPDATE_CHIM_BY_PK.hb", action);

		// INSUR_DRUG TABLE ACTION
		action = new InsurDrugAction("/INSUR_DRUG/DELETE_INSUR_DRUG_BY_PK.jsp", 1);
		actions.put("/DELETE_INSUR_DRUG_BY_PK.hb", action);
		action = new InsurDrugAction("/InsurDrug/INSERT_INSUR_DRUG.jsp", 2);
		actions.put("/INSERT_INSUR_DRUG.hb", action);
		action = new InsurDrugAction("/INSUR_DRUG/SELECT_INSUR_DRUG_BY_PK.jsp", 3);
		actions.put("/SELECT_INSUR_DRUG_BY_PK.hb", action);
		action = new InsurDrugAction("/INSUR_DRUG/SELECT_INSUR_DRUG.jsp", 4);
		actions.put("/SELECT_INSUR_DRUG.hb", action);
		action = new InsurDrugAction("/INSUR_DRUG/UPDATE_INSUR_DRUG_BY_PK.jsp", 5);
		actions.put("/UPDATE_INSUR_DRUG_BY_PK.hb", action);

		
		// INSUR_PRESC TABLE ACTION
		action = new InsurPrescAction("/INSUR_PRESC/DELETE_INSUR_PRESC_BY_PK.jsp", 1);
		actions.put("/DELETE_INSUR_PRESC_BY_PK.hb", action);
		action = new InsurPrescAction("/InsurPRESC/INSERT_INSUR_PRESC.jsp", 2);
		actions.put("/INSERT_INSUR_PRESC.hb", action);
		action = new InsurPrescAction("/INSUR_PRESC/SELECT_INSUR_PRESC_BY_PK.jsp", 3);
		actions.put("/SELECT_INSUR_PRESC_BY_PK.hb", action);
		action = new InsurPrescAction("/INSUR_PRESC/SELECT_INSUR_PRESC.jsp", 4);
		actions.put("/SELECT_INSUR_PRESC.hb", action);
		action = new InsurPrescAction("/INSUR_PRESC/UPDATE_INSUR_PRESC_BY_PK.jsp", 5);
		actions.put("/UPDATE_INSUR_PRESC_BY_PK.hb", action);
		
		// SYMP TABLE ACTION
		action = new SympAction("/SYMP/DELETE_SYMP_BY_PK.jsp", 1);
		actions.put("/DELETE_SYMP_BY_PK.hb", action);
		action = new SympAction("/SYMP/INSERT_SYMP.jsp", 2);
		actions.put("/INSERT_SYMP.hb", action);
		action = new SympAction("/SYMP/SELECT_SYMP_BY_PK.jsp", 3);
		actions.put("/SELECT_SYMP_BY_PK.hb", action);
		action = new SympAction("/SYMP/SELECT_SYMP.jsp", 4);
		actions.put("/SELECT_SYMP.hb", action);
		action = new SympAction("/SYMP/UPDATE_SYMP_BY_PK.jsp", 5);
		actions.put("/UPDATE_SYMP_BY_PK.hb", action);
	}

}
