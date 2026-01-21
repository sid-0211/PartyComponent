ec.entity.makeValue("tutorial.party.Party").setAll([
        partyTypeEnumId: context.partyTypeEnumId,
        createdDate    : context.createdDate
]).setSequencedIdPrimary().create();


