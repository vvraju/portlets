create table HPRMRCP1 (
	ID_old LONG not null primary key,
	LETTERCT VARCHAR(75) null,
	LOCPATH VARCHAR(75) null,
	DOCIDNUM VARCHAR(75) null,
	CLNTNUM VARCHAR(75) null,
	OwnerName VARCHAR(75) null,
	Addrs5 VARCHAR(75) null,
	Postcode VARCHAR(75) null,
	Document_Number VARCHAR(75) null,
	ContrNo VARCHAR(75) null,
	Next_Premium_due_Date VARCHAR(75) null,
	Total_Premium VARCHAR(75) null,
	MainCovr_Risk_Cess_Term VARCHAR(75) null,
	MainCovr_Prem_Cess_Term VARCHAR(75) null,
	Contract_Commencement_Date VARCHAR(75) null,
	Billing_Date VARCHAR(75) null,
	Payment_Desc VARCHAR(75) null,
	Receipt_Date VARCHAR(75) null,
	Payment_Mode VARCHAR(75) null,
	Payment_Description VARCHAR(75) null,
	Receipt_Amount VARCHAR(75) null,
	Contract_Type VARCHAR(75) null,
	Contract_Type_Desc VARCHAR(75) null,
	Current_Bill_Frequency VARCHAR(75) null,
	Suspense_Amount VARCHAR(75) null,
	Footer_Details VARCHAR(75) null,
	Addrs1 VARCHAR(75) null,
	Addrs2 VARCHAR(75) null,
	Addrs3 VARCHAR(75) null,
	Addrs4 VARCHAR(75) null,
	Temp_Rcptno VARCHAR(75) null,
	Life_Name VARCHAR(75) null,
	CAMPAIGN VARCHAR(75) null,
	Agent_Bank_Branch_Code VARCHAR(75) null,
	Agent_Branch_name VARCHAR(75) null,
	Agent_Bank_name VARCHAR(75) null,
	Mobile_phone VARCHAR(75) null,
	Email_id VARCHAR(75) null,
	CreateDate VARCHAR(75) null,
	BatchMode VARCHAR(75) null,
	Status VARCHAR(75) null,
	LastProcessedDate VARCHAR(75) null,
	MobilePhoneNo VARCHAR(75) null,
	Cheque_Number VARCHAR(75) null,
	Bank_Name VARCHAR(75) null,
	EmailAddr VARCHAR(75) null,
	ID INTEGER,
	BDM VARCHAR(75) null,
	Term VARCHAR(75) null,
	Campaign_Code VARCHAR(75) null
);

create table POLICY_DOC_TYPES (
	ID INTEGER not null primary key,
	DOC_NAME VARCHAR(75) null
);

create table PREMIUM_PAID_CERTIFICATE (
	ID LONG not null primary key,
	Financial_Year VARCHAR(75) null,
	Generation_Date VARCHAR(75) null,
	OwnerName VARCHAR(75) null,
	Addrs1 VARCHAR(75) null,
	Addrs2 VARCHAR(75) null,
	Addrs3 VARCHAR(75) null,
	Addrs4 VARCHAR(75) null,
	Addrs5 VARCHAR(75) null,
	Postcode VARCHAR(75) null,
	MobilePhoneNo VARCHAR(75) null,
	Email_ID VARCHAR(75) null,
	Client_ID VARCHAR(75) null,
	Contract_Type_Desc VARCHAR(75) null,
	ContrNo VARCHAR(75) null,
	Installment_Prem VARCHAR(75) null,
	Billing_Frequency VARCHAR(75) null,
	SumAssured VARCHAR(75) null,
	Total_Pre_Paid VARCHAR(75) null,
	Total_Pre_Due VARCHAR(75) null,
	Coverage VARCHAR(75) null,
	Fin_Year INTEGER,
	LETTERCTL VARCHAR(75) null,
	LOCPATH VARCHAR(75) null,
	DOCIDNUM VARCHAR(75) null,
	status VARCHAR(75) null,
	lastProcessedDate VARCHAR(75) null,
	createDate VARCHAR(75) null,
	GLCODE VARCHAR(75) null,
	BRANCH_CODE VARCHAR(75) null
);