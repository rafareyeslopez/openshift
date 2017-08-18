<<<<<<< HEAD
# Billing GUID Checker REST Service

Use this microservice to check if MSISDN is already subscribed to a certain billing GUID.
This REST microservice uses HTTP requests and JPA to make CRUD operations via JSON to and from the database.

It will always return a response as a JSON string, so handle the JSON however you want.
 
## Example usage

Use GET requests to query the msisdns from the database
You can also issue PUT, PATCH, and DELETE REST calls to either replace, update, or delete existing records.

In order to SAVE a new subscription, use a POST request and send a JSON in this format:

```json

URL: <server-ip>:8750/subscription

{
  "msisdn": "<msisdn>",
  "billingGuid": "<billing_guid>"
}

```

#### To find an msisdn and check his billing guids:

```json

<server-ip>:8750/subscription/search/getByMsisdn?msisdn=<msisdn>

```
#### To delete a subscription with msisdn and billing guid:

```json
<server-ip>:8750/subscription/search/deleteByMsisdnAndBillingGuid?msisdn=<msisdn>&billingGuid=<billing-guid>

```

To get all the subscriptions from the database:

``` json

 <server-ip>:8750/subscription

```

To get a specific subscription, use the subscription ID (from this database):

```json

<server-ip>:8710/campaign/{id}

```


## Important
#### Make sure when unsuibscribing users to delete them from this database via DELETE request.
#### Always consult the database first, check if msisdn is present and delete it
=======
# openshift
>>>>>>> branch 'master' of https://github.com/rafareyeslopez/openshift
