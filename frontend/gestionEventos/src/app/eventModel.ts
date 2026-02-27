export class EventModel { //aqui definimos para que la data que venga del backend pueda mapearse en el frontend

    constructor(
        public eventName: string,
        public description: string,
        public startDate: Date,
        public endDate: Date) {}
}
