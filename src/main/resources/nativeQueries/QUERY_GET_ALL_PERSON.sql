select
    person0_.id as id1_10_,
    person0_.address as address2_10_,
    person0_.attachments as attachme3_10_,
    person0_.businessPhone as business4_10_,
    person0_.city as city5_10_,
    person0_.company as company6_10_,
    person0_.countryRegion as countryr7_10_,
    person0_.emailAddress as emailadd8_10_,
    person0_.faxNumber as faxnumbe9_10_,
    person0_.firstName as firstna10_10_,
    person0_.homePhone as homepho11_10_,
    person0_.jobTitle as jobtitl12_10_,
    person0_.lastName as lastnam13_10_,
    person0_.mobilePhone as mobilep14_10_,
    person0_.notes as notes15_10_,
    person0_.stateProvince as statepr16_10_,
    person0_.webPage as webpage17_10_,
    person0_.zipPostalCode as zippost18_10_,
    person0_.clazz_ as clazz_
from
    ( select
          id,
          address,
          attachments,
          businessPhone,
          city,
          company,
          countryRegion,
          emailAddress,
          faxNumber,
          firstName,
          homePhone,
          jobTitle,
          lastName,
          mobilePhone,
          notes,
          stateProvince,
          webPage,
          zipPostalCode,
          0 as clazz_
      from
          Person
      union
          all select
                  id,
                  address,
                  attachments,
                  businessPhone,
                  city,
                  company,
                  countryRegion,
                  emailAddress,
                  faxNumber,
                  firstName,
                  homePhone,
                  jobTitle,
                  lastName,
                  mobilePhone,
                  notes,
                  stateProvince,
                  webPage,
                  zipPostalCode,
                  1 as clazz_
      from
          EmployeesEntity
      union
          all select
                  id,
                  address,
                  attachments,
                  businessPhone,
                  city,
                  company,
                  countryRegion,
                  emailAddress,
                  faxNumber,
                  firstName,
                  homePhone,
                  jobTitle,
                  lastName,
                  mobilePhone,
                  notes,
                  stateProvince,
                  webPage,
                  zipPostalCode,
                  2 as clazz_
      from
          SuppliersEntity
      union
          all select
                  id,
                  address,
                  attachments,
                  businessPhone,
                  city,
                  company,
                  countryRegion,
                  emailAddress,
                  faxNumber,
                  firstName,
                  homePhone,
                  jobTitle,
                  lastName,
                  mobilePhone,
                  notes,
                  stateProvince,
                  webPage,
                  zipPostalCode,
                  3 as clazz_
      from
          ShippersEntity
      union
          all select
                  id,
                  address,
                  attachments,
                  businessPhone,
                  city,
                  company,
                  countryRegion,
                  emailAddress,
                  faxNumber,
                  firstName,
                  homePhone,
                  jobTitle,
                  lastName,
                  mobilePhone,
                  notes,
                  stateProvince,
                  webPage,
                  zipPostalCode,
                  4 as clazz_
      from
          CustomersEntity
    ) person0_