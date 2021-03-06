<!-- SPDX-License-Identifier: Apache-2.0 -->

# Subject Area Open Metadata Access Service (OMAS)

The Subject Area OMAS support subject matter experts who are documenting
their knowledge about a particular subject.  This includes:

* Glossary terms
* Reference Data
* Validation Rules


The Subject Area API enabled subject matter experts to author glossary content. The operations include Find, Create, Read, Update and 
Delete (CRUD) operations on Glossary, Term and Category objects.

These structures are defined as POJO property objects (aka beans).

The module structure for the Subject Area OMAS is as follows:

* [subject-area-client](subject-area-client) supports the client library.
* [subject-area-api](subject-area-api) supports the common Java classes that are used both by the client and the server.
* [subject-area-server](subject-area-server) supports an implementation of the access service and its related event management.
* [subject-area-spring](subject-area-spring) supports the REST API using the [Spring](../../../developer-resources/Spring.md) libraries.
* [subject-area-tools](subject-area-tools) supports code generation of POJO property objects from archive types 

The implementation is not complete. The following has been implemented : 
 * Rest API for create , get and update for Glossary.

Example Rest calls: 

Example 1) Create Glossary instance
POST url :
 localhost:8080/open-metadata/access-services/subject-area/users/david/glossaries 
body :
{
"name":"Test glossary 1",
"description":"This is a Glossary for testing.",
"usage":"for test",
"governanceActions":{
"confidentiality":{
	"level":"Confidential",
	   "confidence":"10",
        "steward":"Stuart",
        "source":"source value",
        "notes":"An interesting note",
         "status":"Proposed"
        
},
"criticality":{
	"level":"Important",
	   "confidence":"9",
        "steward":"Stuart2",
        "source":"source value2",
        "notes":"An interesting note ish",
         "status":"Imported"
        
},
"confidence":{
	"level":"AdHoc",
	   "confidence":"9",
        "steward":"Stuart2",
        "source":"source value2",
        "notes":"An interesting note ish",
         "status":"Imported"
        
},
"retention":{
	"confidence":6,
	"notes":"some notes",
	"steward":"Fred",
	"source":"a source",
	"basis":"RegulatedLifetime"
}
}
}
Example 2) Get Glossary instance (where <<guid>> is the guid in the Glossary create response)
GET url : localhost:8080/open-metadata/access-services/subject-area/users/david/glossaries/<<guid>>

Example 3) Delete Glossary instance (where <<guid>> is the guid in the Glossary create response)

