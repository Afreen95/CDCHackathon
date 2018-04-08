CREATE VIEW SOURCEDATA AS 
SELECT acc.name as accountName,
       acc.type,
       acc.PARENTID,
       acc.BILLINGSTREET,
       acc.BILLINGCITY,
       acc.BILLINGSTATE,
       acc.BILLINGPOSTALCODE,
       acc.BILLINGCOUNTRY,
       acc.PHONE as accountPhone,
       acc.ACCOUNTNUMBER,
       acc.WEBSITE,
       acc.ANNUALREVENUE,
       acc.INDUSTRY,
	   cc.id as contactid,
       cc.ACCOUNTID,
       cc.LASTNAME,
       cc.FIRSTNAME,
       cc.SALUTATION,
       cc.name as contactName,
       cc.phone as contactPhone,
       cc.MAILINGSTREET,
       cc.MAILINGCITY,
       cc.MAILINGSTATE,
       cc.MAILINGPOSTALCODE,
       cc.MAILINGCOUNTRY,
       cc.MOBILEPHONE,
       cc.OTHERPHONE,
       cc.ASSISTANTPHONE,
       cc.EMAIL,
       cc.TITLE,
       cc.DEPARTMENT
	   FROM account_load acc INNER JOIN 
contact_load cc on acc.ID = cc.ACCOUNTID
WHERE acc.INDUSTRY IS NOT NULL AND acc.INDUSTRY != ''
AND acc.BILLINGCITY IS NOT NULL AND acc.BILLINGPOSTALCODE IS NOT NULL
AND cc.DEPARTMENT NOT LIKE '%Admin%' AND cc.TITLE NOT LIKE '%Admin%'
AND cc.MOBILEPHONE IS NOT NULL AND cc.MOBILEPHONE regexp '[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]';