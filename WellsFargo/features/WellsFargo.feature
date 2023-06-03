
Feature: Automate the Status check of WellsFargo Job Applications

Scenario: Logging into WellsFargo Workday

	Given User is on WellsFargo Login Page
	When User enter the credentials and sign on
	Then User is logged into Wellsfargo home page