<!-- SPDX-License-Identifier: Apache-2.0 -->

# Open Metadata Repository Services (OMRS) Overview

Figure 1 shows the external APIs for the OMRS.


![Figure 1](omrs-system-context-diagram.png)
**Figure 1: OMRS System Context Diagram**

On the left hand side is the **[administration interface](../../governance-servers/admin-services/README.md)** supported by the OMAG server.
This is where configuration is passed to the OMRS, and status and other
relevant information is made available to the OMAG Administration Services.

Along the top is the interface with the **[Open Metadata Access Services (OMAS)](../../access-services/README.md)**.
The OMRS provides access to the open metadata repositories
through both a call API (see **[Enterprise OMRS Repository Connector](component-descriptions/enterprise-repository-connector.md)**) and an event topic
(see **[Federated OMRS Topic](omrs-event-topic.md)).

Along the bottom are the **[six types of connectors](component-descriptions/connectors/README.md)** that
provide the OMRS with access to the stores and system resources it needs to support the OMAS.

These connectors enable the OMRS to be deployed into different
types of server environments and connect with different types
of infrastructure and services.

Repository connectors provide a common interface for metadata repositories.
The OMRS store connectors can range from simple files stores to
enterprise / cloud provider admin repositories and the event topic can
support different types of messaging infrastructure.


## OMRS Subsystems

Inside the OMRS are 4 major groups of components: Enterprise Repository Services, Administration Services,
Cohort Services and Local Repository Services.

![Figure 2](omrs-component-overview-level-1.png)
**Figure 2: Component Overview (level 1)**

* **[Enterprise Repository Services](subsystem-descriptions/enterprise-repository-services.md)** provides a virtual
metadata repository by combining the content of multiple open metadata
repositories and delivering this metadata through a single API and event topic.
The Enterprise Repository Services provide the enterprise access metadata
support for the OMASs.

* **[Administration Services](subsystem-descriptions/administration-services.md)** drive the
initialization of the OMRS at server start up plus access to the OMRS's
internal status.  It relies on the OMAG Server to supply it with the
configuration information to initialize the connectors it should use and
connector with other open metadata servers.

* **[Cohort Services](subsystem-descriptions/cohort-services.md)** manage the local
server's membership in one or more open metadata repository cohorts.

* **[Local Repository Services](subsystem-descriptions/local-repository-services.md)** manage the local
server's open metadata repository.

The OMRS is highly configurable.  The figures below shows the different combinations.
Figure 3 shows the OMRS supporting the OMASs with access to a single,
local only repository - with no connectivity to other open metadata repositories.

![Figure 3](omrs-role-local-only.png)
**Figure 3: Local only**

Figure 4 shows the OMRS supporting a server with no local repository - so that all
metadata for the OMASs is coming through the cohort services from remote metadata repositories.
This is the [caller integration pattern](../../../open-metadata-publication/website/open-metadata-integration-patterns/caller-integration-pattern.md).

![Figure 4](omrs-role-access-layer.png)
**Figure 4: Access services**

Figure 5 shows OMRS supporting a simple repository proxy server.
The OMASs are not deployed and the local repository is configured
to connect as an adapter for a non-native open metadata repository.
The cohort services connect this metadata repository with other
members in one or more cohorts.
This is called the **[adapter integration pattern](../../../open-metadata-publication/website/open-metadata-integration-patterns/adapter-integration-pattern.md)**.

![Figure 5](omrs-role-repository-proxy.png)
**Figure 5: Repository proxy**

Figure 6 shows all of the OMRS components in operation, supporting
the OMASs with a local repository and connectivity to other
repositories through the cohort servers.

![Figure 6](omrs-role-complete.png)
**Figure 6: Complete**


## OMRS Components

The different combinations of operation required means that the OMRS
components need to be flexible and communicate with one another through
well-defined interfaces so that component implementations can be swapped
in and out to support different configurations.

Figure 7 shows the main components of OMRS within each subsystem.

![Figure 7](omrs-component-overview-level-1.png)
**Figure 7: Component Overview (level 2)**

Follow the links for more details of 
these **[subsystems](subsystem-descriptions/README.md)**
and **[components](component-descriptions/README.md)**.
